// Time Complexity :O(N*2) n are the number of elements in the given array.
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No.


// Your code here along with comments explaining your approach:
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums==null||nums.length==0){
            return result;
        }
        Arrays.sort(nums);
        int low=0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]>0)
                break;
            if(i>0 && nums[i]==nums[i-1])
                continue;
            low=i+1;            
            int high=nums.length-1;
            while(low<high){
                if(0==nums[i]+nums[low]+nums[high]){
                    result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;
                    high--;
                     while(low<high && nums[low]==nums[low-1])
                    low++;
                while(low<high && nums[high]==nums[high+1])
                    high--;
                }
                else if(0>nums[i]+nums[low]+nums[high])
                    low++;
                else
                    high--;               
            }
        }
        return result;        
    }
}