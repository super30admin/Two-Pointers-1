
// Time Complexity : O(n^2) n= length of the array
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
// Your code here along with comments explaining your approach
//1.Sort the Array and keep a atrck of the left and right pointers which would also check for dupliates in the array.
//2. When the sum would add up to 0 adding those three value would give us the solution
import java.util.*;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length == 0 || nums == null)
            return new ArrayList<>();
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i - 1])
                continue;

            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int cur = nums[i] + nums[left] + nums[right];
                if (cur == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    while (left < right && nums[left] == nums[left - 1])
                        left++;
                    right--;
                    while (left < right && nums[right] == nums[right + 1])
                        right--;

                } else if (cur < 0) {
                    left++;
                    while (left < right && nums[left] == nums[left - 1])
                        left++;
                } else {

                    right--;
                    while (left < right && nums[right] == nums[right + 1])
                        right--;

                }
            }
        }

        return res;
    }

    public static void main(String args[]) {
        ThreeSum obj = new ThreeSum();
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        System.out.println(obj.threeSum(nums));

    }
}