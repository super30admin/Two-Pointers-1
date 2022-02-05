import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        int i = 0;
        Arrays.sort(nums);

        while (i < nums.length - 2) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> trip = new ArrayList<>();
                    trip.add(nums[i]);
                    trip.add(nums[left]);
                    trip.add(nums[right]);
                    ans.add(trip);

                    // avoid duplicate
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
                while (i < nums.length - 2 && nums[i] == nums[i + 1]) {
                    i++;
                }
            }
            i++;
        }
        return ans;
    }
}
