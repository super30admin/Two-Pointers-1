import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TC: O(n^2)
//SC: O(1)
// Implemented using two pointer and optimized with no use of extra space
class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i< n-2; i++) {
            if(nums[i] > 0) {
                break;
            }
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i + 1;
            int right = n -1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(left < right && (nums[left] == nums[left-1])) {
                        left++;

                    }
                    while(left < right && (nums[right] == nums[right+1])) {
                        right--;

                    }

                } else if(sum > 0) {
                    right--;

                }else {
                    left++;

                }
            }
        }
        return result;


    }
}