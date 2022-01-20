//TC: O(n^2)
//SC: O(1)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length - 2; i++) {
            int low = i + 1;
            int high = nums.length - 1;
            if(i != 0 && nums[i] == nums[i-1]) continue;
            while(low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0) {
                    List<Integer> l1 = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(l1);
                    low++;
                    high--;
                    while(low < high && nums[low] == nums[low - 1]) {
                        low++;
                    }
                    while(low < high && nums[high] == nums[high + 1]) {
                        high--;
                    }
                }
                else if(sum < 0) {
                    low++;
                }
                else {
                    high--;
                }
            }
        }
        return result;
    }
}
