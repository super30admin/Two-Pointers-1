import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    // Time complexity: O(n * n)
        // For each element we are searching linearly
    // Space complexity: O(1)
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length ==0) return new ArrayList<>();

        // 2 pointer solution
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i < nums.length; i++) {
            // To avoid duplicate triplets
            // Outer loop is selecting a pivot element.
            // If the current pivot element is equal to the previously assumed pivot element then move to the next element
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0) {
                    List<Integer> pair = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(pair);
                    left++;
                    right--;
                    // Again, to avoid the duplicate triplets
                    while(left < right && nums[left] == nums[left - 1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }else if(sum < 0){
                    left++;
                }else {
                    right--;
                }


            }
        }


        return result;
    }
}
