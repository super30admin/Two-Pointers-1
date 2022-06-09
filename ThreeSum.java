// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

import java.util.*;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if(nums==null || nums.length==0) return result;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){

            if(i>0 && nums[i]==nums[i-1]) continue;
            int low = i+1;
            int high = n-1;

            while(low<high){
                int sum = nums[i]+nums[low]+nums[high];
                if(sum==0){
                    List<Integer> list = Arrays.asList(nums[i],nums[low],nums[high]);
                    result.add(list);
                    low++;
                    high--;
                    //internal duplicacy
                    while(low<high && nums[low]==nums[low-1]) low++;
                    while(low<high && nums[high]==nums[high+1]) high--;
                }
                else if(sum>0){
                    high--;
                }
                else{
                    low++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args){
        int [] nums = new int[]{-1,0,1,2,-1,-4};
        ThreeSum ts = new ThreeSum();
        System.out.println(ts.threeSum(nums));
    }
}