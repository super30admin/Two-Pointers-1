// Time Complexity : O(NlogN)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : i forgot to check the perivios element == curr element
// in twoSum function.

// Your code here along with comments explaining your approach


class Solution {
    List<List<Integer>> result = new ArrayList();
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length && nums[i] <= 0; i++) {
            if(i == 0 || nums[i] != nums[i - 1])
                twoSum(nums, i);            
        }
        
        return result;        
    }
    
    public void twoSum(int[] nums, int i) {
        
         
        int start = i + 1, end = nums.length - 1;
        
        while(start < end) {
            int sum = nums[i] + nums[start] + nums[end];
            
            if(sum > 0 || (end < nums.length - 1 && nums[end] == nums[end + 1]))
                end--;
            else if(sum < 0 || (start > i + 1 && nums[start] == nums[start - 1])){
                start++;
            }
            else {
                List<Integer> res = new ArrayList();
                res.add(nums[i]);
                res.add(nums[start]);
                res.add(nums[end]);
                result.add(res);
                start++;
                end--;
            }            
        }
        
    }
    
}