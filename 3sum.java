// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
// Iterate over the array and then apply the solution
// for Two Sum with two pointer. Needed to sort the array.
class Solution {
    
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length ==0)
            return new ArrayList<>();
        
        Arrays.sort(nums);
        
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            int a = nums[i];
            if(i>0  && a==nums[i-1])
                continue;
            int left=i+1;
            int right =nums.length-1;
            
            while(left<right){
                int sum = a + nums[left] + nums[right];
                if(sum > 0)
                    right--;
                else if(sum < 0)
                    left++;
                else{
                    res.add(Arrays.asList(a, nums[left], nums[right]));
                    left++;
                    while(nums[left] == nums[left-1] && left<right)
                        left++;
                }
            }
        }
        return res;
    }
}