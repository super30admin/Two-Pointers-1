class Solution {
    // Time Complexity : O(n2)
    // Space Complexity : O(1)
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No

    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < n-2; i++) {
            int low = i+1;
            int high = n-1;
            if(i != 0 && nums[i] == nums[i-1])
                continue;
            while(low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.addAll(Arrays.asList(nums[i], nums[low], nums[high]));
                    result.add(list);
                    low++;
                    high--;
                    while(low < high && nums[low] == nums[low-1])
                        low++;
                    while(low < high && nums[high] == nums[high+1])
                        high--;
                } else if(sum < 0) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        return result;
    }
}