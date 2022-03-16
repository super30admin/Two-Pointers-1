// Time Complexity : O(N*N) 
// Space Complexity : O(log N)-O(N), depending on the sorting algorithm
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result= new ArrayList<>();
        
        for(int i=0;i<nums.length-2;i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;
            
            int low=i+1;
            int high=nums.length-1;
            
            while(low<high){
                int sum = nums[i]+nums[low]+nums[high];
                
                if(sum==0){
                    List<Integer> temp =  Arrays.asList(nums[i],nums[low],nums[high]);
                    result.add(temp);
                    low++;
                    high--;
                    while(low<high && nums[low]==nums[low-1])low++;
                    while(low<high && nums[high]==nums[high+1])high--;
                }
                else if(sum>0){
                    high--;
                }
                else
                    low++;
            }
        }
        return result;
    }
}