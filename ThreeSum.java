import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Time Complexity: O(n log n) as the traversing till length - 2 is carried out but the sorting is done prior
// Space Complexity: O(1) as the code expects to return the 2D arrayList. No more than return type is used in the code.

// Three Pointers are used here. We can say this is the extension of 2 sum.
// first pointer is incremented linearly but left and right, are next to first
public class ThreeSum {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[] { -1, 0, 1, 2, -1, -4 }));
        System.out.println(threeSum(new int[] { 0, 1, 1 }));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int current = 0; current < nums.length - 2; current++) {
            int left = current + 1;
            int right = nums.length - 1;
            if (current > 0 && nums[current] == nums[current - 1])
                continue;
            if (nums[current] > 0)
                break;
            while (left < right) {
                int sum = nums[current] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[current], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1])
                        left++;
                    while (left < right && nums[right] == nums[right + 1])
                        right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}
