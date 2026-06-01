//Time Complexity : O(n^2)
//Space Complexity : O(1)


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length ; i++) {
            if(nums[i] > 0) break;
            if(i > 0 && nums[i-1] == nums[i]) {
                continue;
            }

            int left = i+1;
            int right = nums.length - 1;

            while (left < right) {
                int curr = nums[left] + nums[right] + nums[i];
                if (curr == 0) {
                    List<Integer> li = new ArrayList<>(List.of(nums[i],nums[left],nums[right]));
                    result.add(li);
                    left++;
                    right--;
                    while(left< right && nums[left] == nums[left-1]) {
                        left++;
                    }
                    while(left< right && nums[right] == nums[right+1]) {
                        right--;
                    }
                }
                else if(curr > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result;
    }

}
