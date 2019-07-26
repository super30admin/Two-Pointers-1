/*
Time Complexity : O(n)
Space Complexity : O(n)
Did this code successfully run on Leetcode : Runs with Runtime: 31 ms,
                                             Memory Usage : 46.7 MB.
Any problem you faced while coding this : Implemented as taught in class
*/

import java.util.*;

class threeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 3) return result;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n-2; i++){
            if((i > 0) && (nums[i-1] == nums[i])) continue;
            int low = i+1;
            int high = n -1;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                // case1 sum == 0;
                if(sum == 0){
                    List<Integer> current = Arrays.asList(nums[i],nums[low],nums[high]);
                    result.add(current);
                    low++; high--;
                    while(low < high && nums[low] == nums[low -1]) low++;
                    while(low < high && nums[high] == nums[high + 1]) high--;
                }else if(sum < 0){
                    low++;
                }else{
                    high--;
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.print(threeSum(nums));
    }
}
