import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Time Complexity : O(N^2) where N is the number elements in array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Two sum with 3 ptrs, and to avoid dupes, check adjacent elements and iterate in while loop format.
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        if(nums.length==0 || nums==null) return result;

        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;
            int left=i+1, right=nums.length-1;

            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    List<Integer> list=Arrays.asList(nums[i],nums[left],nums[right]);
                    result.add(list);
                    left++;
                    right--;

                    while(left<right && nums[left]==nums[left-1]) left++;
                    while(left<right && nums[right]==nums[right+1]) right--;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }

        }

        return result;
    }
}
