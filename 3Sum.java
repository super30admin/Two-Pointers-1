// TC = O(n2)
// SC = O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // null
        if(nums == null || nums.length == 0) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < n - 2; i++) {
            // we've crossed 0 (&its sorted) we wont get any more triplets with sum 0
            if(nums[i] > 0) break;
            // check duplicates at external level
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int low = i + 1, high = n - 1;
            while(low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0) {
                    // List<Integer> l = new ArrayList<>();
                    // l.add(nums[i]);
                    // l.add(nums[low]);
                    // l.add(nums[high]);
                    List<Integer> l = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(l);
                    low++; high--;
                    // check duplicates at internal level
                    while(low < high && nums[low] == nums[low - 1]) low++;
                    while(low < high && nums[high] == nums[high + 1]) high--;
                }
                else if(sum > 0) high--;
                else low++;
            }
        }
        return result;
    }
}