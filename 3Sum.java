import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Container With Most Water
// Time Complexity : O(nlogn) + O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length<3)
            return new ArrayList<>();
        List<List<Integer>> ans= new ArrayList<>();
        int n=nums.length;
        //first sort the array
        Arrays.sort(nums);
        
        for(int i=0; i<n;i++){
            if(i>0 && nums[i] == nums[i-1]) 
                continue;
            if(nums[i]>0)
                break;
            int left = i+1;
            int right = n-1;
            while(left < right){
                 int sum = nums[i] + nums[left] +nums[right];
                if(sum==0){
                    List<Integer> triplet = Arrays.asList(nums[i], nums[left], nums[right]);
                    ans.add(triplet);
                    left++;
                    right--;
                    
                    while(left<right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left<right && nums[right] == nums[right+1]){
                        right--;
                    }
                }
                else if(sum<0){
                    left++;
                }
                else right--;
            }
            
        }
        return ans;
    }
}