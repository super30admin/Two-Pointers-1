import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Using 2 pointer approach
//For using 2 pointer the array needs to be sorted
//tc: O(nlogn)
//SC: O(1)

class threeSum {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            //If value at i = i-1 there will be possibility of adding duplicate to the list
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    //
                    while (left < right && (nums[left] == nums[left - 1])) {
                        left++;
                    }
                    while (left < right && (nums[right] == nums[right + 1])) {
                        right--;
                    }
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                } else {
                    right--;
                }
            }

        }
        return result;
    }
}
