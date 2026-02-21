// Time Complexity : O(nlogn)(sorting) + O(n)*O(n)(traversal*2sum computation)= O(nlogn) + O(n^2) = O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no

// Your code here along with comments explaining your approach
/*
Sort the given array first.Now, use left, right and i pointers to compute the sum and check if it equals
0.If so, form the values of those pointers as a list and make sure to check duplicate values exist to
avoid duplicate traversals and calculations.If sum is not 0, move left and right pointers accordingly.
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i = 0 ; i < n ; i++) {
            int left = i + 1 , right = n - 1;
            if(i != 0 && nums[i] == nums[i - 1])
                continue;
            while(left < right) {
                int sum = nums[left] + nums[right] + nums[i];
                if(sum == 0) {
                    List<Integer> list = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(list);
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left - 1])
                        left++;
                    while(left < right && nums[right] == nums[right + 1])
                        right--;
                }
                else if(sum < 0)
                    left++;
                else if(sum > 0)
                    right--;
            }
        }
        return result;
    }
}