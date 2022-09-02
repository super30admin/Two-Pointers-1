import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ## Problem2 (https://leetcode.com/problems/3sum/)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;
        int n = nums.length;
        Arrays.sort(nums);
        
        for (int i = 0; i< n-2; i++) {
            if (i!= 0 && nums[i] == nums[i-1]) continue;
            int low = i+1;
            int high = n-1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum == 0) {
                    List<Integer> li = Arrays.asList(nums[i] ,nums[low] ,nums[high]);
                    result.add(li);
                    low++;
                    high--;
                    while (low < high && nums[low] == nums[low-1]) low++;
                    while (low < high && nums[high] == nums[high+1]) high--;
                }
                else if (sum > 0) high--;
                else low++;
            }
        }
        return result;
    }
}