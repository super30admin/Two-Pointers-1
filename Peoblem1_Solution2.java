import java.util.HashMap;
import java.util.Map;
/*
Time Complexity-> O(3*N)
Space COmplexity -> O(1)
*/
class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (mpp.containsKey(nums[i])) {
                mpp.put(nums[i], mpp.get(nums[i]) + 1);
            } else {
                mpp.put(nums[i], 1);
            }
        }
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();
            for (int i = 0; i < frequency; i++) {
                nums[index++] = number;
            }
        }

    }
}