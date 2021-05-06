// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
    We use a two poiter approach and an outer loop to make sure we find the possible combinations 
    for that outer iteration. 
    In the inner loop, we move the pointers based on the sum we get.
    In order to skip the same combination we loop through the array until the element is not equal to the adjacent.
*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0; i<nums.length-2; i++){
            int low = i+1;
            int high = nums.length-1;
            if (i>0 && nums[i-1]==nums[i]) continue;
            while (low<high){
                int sum = nums[i]+nums[low]+nums[high];
                if (sum==0) {
                    List<Integer> newList = Arrays.asList(nums[i],nums[low],nums[high]);
                    result.add(newList);
                    low++; high--;
                    while (low<high && nums[high] == nums[high+1]) high--;
                    while (low<high && nums[low] == nums[low-1]) low++;
                }
                else if (sum>0) high--;
                else low++;   
            }
        }
        return result;
    }
}