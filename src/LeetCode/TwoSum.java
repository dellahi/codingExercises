package LeetCode;

import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        HashMap<Integer,Integer> elemnts = new HashMap<>();
        for (int i=0;i< nums.length;i++ ) {
            if (nums[i]<= target) elemnts.put(nums[i],i);

        }
        for (Integer i : elemnts.keySet() ){
            Integer j = target - i;
            if(Collections.frequency(elemnts.keySet(),j)!=0) {
                result[0]=elemnts.get(i);
                result[1]=elemnts.get(j);
                break;
            }
        }
        return result;
    }
}