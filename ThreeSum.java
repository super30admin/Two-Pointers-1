
// Time Complexity :O(n square)
// Space Complexity :O(1)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
      
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length && nums[i] <= 0; ++i)
            if (i == 0 || nums[i - 1] != nums[i]) {
                twoSum(nums, i, ans);
            }
        return ans;
        }
        void twoSum(int[] nums, int i, List<List<Integer>> ans) {
        int lo = i + 1, hi = nums.length - 1;
        while (lo < hi) {
            int sum = nums[i] + nums[lo] + nums[hi];
            if (sum < 0) {
                ++lo;
            } else if (sum > 0) {
                --hi;
            } else {
                ans.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
                while (nums[lo] == nums[lo - 1] &&lo < hi )
                    ++lo;
            }
        }
    }
}