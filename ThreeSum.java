//Time complexity: O(n^2)
//Space complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
//Approach
//1) Sort the array, initalize 3 pointers
//2) if we have duplicate adjacent values then increase pointer
//3) if sum =0 print, if > 0 decrease k and if < 0 increase j
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0) return new ArrayList<>();
        Arrays.sort(nums);
        ArrayList<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while (j < k) {
                if (k < nums.length - 1 && nums[k] == nums[k + 1]) {
                    k--;
                    continue;
                }
                if (nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    ArrayList<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[k]);
                    result.add(l);
                    j++;
                    k--;
                }
            }
        }
    return result;
    }

	public static void main(String[] args) {
		ThreeSum obj = new ThreeSum();
		int nums[] = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> result = obj.threeSum(nums);
		System.out.println(result.size());
	}

}
