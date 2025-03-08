import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem2 {
    // Time Complexity: O(n)
    // Space Complexity: O(n^2)
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n= nums.length;
        int target=0;
        for (int i=0;i<n;i++)
        {
            if (nums[i]==nums[i-1]){continue;}
            int low=i+1, high= n-1;
            while (low<high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;

                    while (low<high && nums[low] == nums[low - 1]) {
                        low++;
                    }
                    while (low<high && nums[high] == nums[high + 1]) {
                        high--;
                    }
                } else if (sum<target) {
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
