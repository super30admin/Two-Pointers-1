// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
//sort the array to avoid processing duplicates, for negetives, look for its compliment formed by two positive numbers 

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length==0)
            return new ArrayList<List<Integer>>();
        
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        
        for (int i=0; i<nums.length && nums[i]<= 0; i++)
            if (i==0 || nums[i - 1]!=nums[i]) {
                twoSumII(nums, i, result);
            }
        
            return result;
    }
    void twoSumII(int[] nums, int i, List<List<Integer>> result) {
        int low=i+1, high=nums.length-1;

        while (low < high) {
            int sum = nums[i] + nums[low] + nums[high];
            
            if (sum < 0) {
                low++;
            } else if (sum > 0) {
                high--;
            } else {
                result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                low++;
                high--;
                
                while(low<high && nums[low]==nums[low-1])
                    low++;
            }
        }
    }
}