// Time Complexity : O(n*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// First we sort the array, then we do a nested iteration
// In the outer loop, we take the nums[i] element 
// In the inner loop, we treat it as a two sum problem with target equal to nums[i] and use two pointer solution

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            if(nums[i] > 0) //if value is greater than target break
                break;
            if(i>0 && nums[i]==nums[i-1]) // to prevent duplication of elements in outer loop
                continue;
            int start = i+1;
            int end = nums.length-1;
            while(start<end){
                int sum = nums[start]+nums[end]+nums[i];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[start],nums[end]));
                    start++; end--;
                    while(start<end && nums[start]==nums[start-1]) // to prevent duplication of elements in inner loop
                        start++;
                    while(start<end && nums[end]==nums[end+1]) //again check start<end because we are updating base condition variables
                        end--;
                }
                else if(sum<0)
                    start++;
                else
                    end--;
            }
        }    
        return result;
    }
}