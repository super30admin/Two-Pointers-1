// Time Complexity :O(nlogn)+O(n) sorting and two pointer approach 
// Space Complexity :O(n) takinga  temporary list
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
import java.util.*;

public class Solution2 {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null||nums.length==0)
            return new ArrayList<>();
        List<List<Integer>> result= new ArrayList<>();
        // sorting the array to keep lower numbers on left and higher numbers on right
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            //if consequtive ith index are same
            if(i>0 && nums[i]==nums[i-1])
              continue;
            // if a number itself is greater than 0 we cannot form o with three numbers in sorted array
            if(nums[i]>0)
                break;
        int low=i+1;
        int high=nums.length-1;
            while(low<high){
                int sum=nums[i]+nums[low]+nums[high];
                // target sum is 0
                if(sum==0){
                    List<Integer> li= Arrays.asList(nums[i],nums[low],nums[high]);
                    result.add(li);
                    low++;
                    high--;
                    // if consecutive low indices are same
                    while(low<high&& nums[low]==nums[low-1]){
                        low++;
                    }
                    // if consequtive high indices are same
                    while(low<high && nums[high]==nums[high+1]){
                        high--;
                    }
                }
                else if (sum>0){
                    high--;
                }
                else{
                    low++;
                }
            }
        }
        return result;
    } 
}
