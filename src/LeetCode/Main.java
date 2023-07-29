package LeetCode;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your Test cases here
        System.out.println(binarySequenceOfOnes(new int[]{1,1,0,1,1,1}));
        System.out.println(evenNumbersOfDigits(new int[]{12,345,2,6,7896}));
    }

    /**
     * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {


        if (n >= 0) System.arraycopy(nums2, 0, nums1, m, n);

        Arrays.sort(nums1);

    }

    /**
     * Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right
     *  elements beyond the length of the original array are not written
     * @param arr
     */
    public void duplicateZeros(int[] arr) {

        int length = arr.length;
        int rotation=0;
        int newIndexOfElem=0;

        for (int i=0; i<length; i++)
        {
            newIndexOfElem = i + rotation;

            if (newIndexOfElem< length-1 && arr[newIndexOfElem] == 0)
            {

                for(int j=length-1; j > newIndexOfElem+1; j--) arr[j] =arr[j-1];

                arr[newIndexOfElem+1] =0;

                rotation++;
            }
        }
    }

    /**
     * how many item contain an even number of digits.
     * @param nums
     * @return result
     */
    public static int evenNumbersOfDigits(int[] nums) {

        int result=0;

        for(int i : nums)
        {
            if(String.valueOf(i).length() % 2 ==0) result++;

             /*
            int j=0;

            while(i/Math.pow(10,j)>=1) j++;

            if(Math.log10(i)%2==0) result++;
            */
        }
        return result;
    }

    /**
     * Max consecutive Ones in binary Array
     * @param arr of O and 1
     * @return maxSequence the maximum number of consecutive 1's in the array
     */
    public static int binarySequenceOfOnes(int[] arr){
        int maxSequence = 0;
        int count=0;

        for (int i : arr ) {
            System.out.println(i);
            if (i==1) count++;
            else {
                if (count>maxSequence) maxSequence=count;
                System.out.println(count);
                count=0;
            }
            if (count>maxSequence) maxSequence=count;
        }
        return maxSequence;
    }

    /**
     * Squares of a Sorted Array
     * @param nums
     * @return
     */
    public int[] sortedSquares(int[] nums) {

        for (int i=0; i<nums.length; i++)
        {
            nums[i] = (int) Math.pow(nums[i],2);
        }
        Arrays.sort(nums);

        return nums;

    }

}