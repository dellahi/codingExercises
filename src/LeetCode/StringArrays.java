package LeetCode;

import java.util.*;

public class StringArrays {

    /*
    @param integer array nums, integer k
    @return true if nums has a continuous subarray of size at least two whose elements sum up to a multiple of k, or false otherwise.
     */
    public boolean checkSubarraySum(int[] nums, int k) {
        int N = nums.length;
        int indexFin;

        for (int indexDebut=0; indexDebut<N-1; indexDebut++) {

            indexFin=indexDebut+2;

            if(nums[indexDebut] == 0){
                if(nums[indexDebut+1] == 0 || nums[indexDebut+1] == k) return true;
                continue;
            }

            if(nums[indexDebut] == k && nums[indexDebut+1] == 0) return true;

            while (indexFin<=N){
                if(nums[indexFin-1]==0) {indexFin++; continue;}
                int[] subArray = Arrays.copyOfRange(nums,indexDebut,indexFin);
                int sum = Arrays.stream(subArray).filter(num -> num!=0).sum();
                if(sum % k == 0 || sum == 0) return true;
                indexFin++;
            }
        }

        return false;
    }
    /*
    Check If Two String Arrays are Equivalent
     */

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";
        for (String s : word1){
            s1 = s1.concat(s);
        }
        for (String s : word2) {
            s2 = s2.concat(s);
        }
        return s1.equals(s2);
    }

    public static boolean notGoodString(List<Integer> arr){
        boolean ok = false;
        for(Integer i : arr) {
            if (Collections.frequency(arr, i) != 1 && i != 0) {
                ok = true;
                break;
            }
        }
        return ok;
    }

    public static List<Integer> charOccurenceCounter(String s) {

        Map<Character, Integer> charsOccurence = new HashMap<>();

        for(char c : s.toCharArray()) charsOccurence.put(c,charsOccurence.getOrDefault(c,0)+1);

        System.out.println(charsOccurence.values());

        return new ArrayList<>(charsOccurence.values());
    }

    public static int minDeletions(String chaineS) {
        int minGoodness = 0;

        if((1 <= chaineS.length()) && (chaineS.length() <= Math.pow(10,5)) && (chaineS.compareTo(chaineS.toLowerCase()) == 0)) {

            List<Integer> charsOccur = charOccurenceCounter(chaineS);

                while (  notGoodString(charsOccur)) {
                    for (Integer i : charsOccur) {
                        if (Collections.frequency(charsOccur,i)!= 1 && i != 0){
                            charsOccur.set(charsOccur.indexOf(i), i - 1);
                            minGoodness++;
                        }
                }
                System.out.println(charsOccur);
            }

        }
        return minGoodness;
    }

}