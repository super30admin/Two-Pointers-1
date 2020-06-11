// Time Complexity : O(n^2) --> where n is length of input array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode (15): Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {   
        if (nums == null || nums.length == 0) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) { 
            // duplicacy of outermost list
            if (i > 0 && nums[i] == nums[i-1]) continue;
            if (nums[i] >  0) break;   
            int low = i + 1;
            int high = n - 1;
            
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum == 0) {
                    List<Integer> li = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(li);
                    low++;
                    high--;
                    // duplicacy of inner   list
                    while (low < high && nums[low] == nums[low - 1]) low++;
                    while (low < high && nums[high] == nums[high + 1]) high--;
                }
                else if (sum < 0) low++;
                else high--;
            }
            
        }
        return new ArrayList<>(result);
    }
}