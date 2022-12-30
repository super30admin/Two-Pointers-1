// 3Sum
// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach
// Sort the array and apply two pointers. (low & high are two pointers here)
// then traverse & if triplets sum is 0 add them to the list
// if the sum less than 0, move the low pointer. if the sum higher than 0, move the high pointer.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for(int i = 0; i < n-2; i++) {
            if(nums[i] >0)
                break;
            //outside duplicate
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            int low = i+1;
            int high = n-1;
            while(low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0) {
                    List<Integer> li = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(li);
                    low++;
                    high--;
                    //inside duplicate
                    while(low < high && nums[low] == nums[low - 1])
                        low++;
                    while(low < high && nums[high] == nums[high + 1])
                        high--;
                }
                else if(sum > 0)
                    high--;
                else
                    low++;
            }

        }
        return result;
    }
}