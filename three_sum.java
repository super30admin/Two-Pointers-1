// Time Complexity : O(n^2+ nlogn) = O(n^2) where n is the length of nums array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// CODE:

class three_sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums); // sorting of nums array ->O(nlogn)
        for (int i = 0; i < n - 2; i++) { // for outside elements
            // handling outside duplicacy
            if (i != 0 && nums[i] == nums[i - 1])
                continue;
            int low = i + 1, high = n - 1;
            while (low < high) { // using two ptrs
                int sum = nums[i] + nums[low] + nums[high];
                if (sum == 0) { // is sum is target ,then add the triplet to res adjust the pointers
                    List<Integer> temp = Arrays.asList(nums[i], nums[low], nums[high]); // adding triplet as list to
                                                                                        // temp
                    res.add(temp);
                    low++;
                    high--;
                    // handling inside duplicacy
                    while (low < high && nums[low] == nums[low - 1])
                        low++;
                    while (low < high && nums[high] == nums[high + 1])
                        high--;
                } else if (sum < 0) { // if sum is less than 0 , then increement low
                    low++;
                } else {
                    high--;
                }
            }
        }
        return res;
    }
}