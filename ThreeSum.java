import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Step 1: Sort the array
        
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate nums[i]
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicates for nums[left]
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // Skip duplicates for nums[right]
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // need a larger sum
                } else {
                    right--; // need a smaller sum
                }
            }
        }
        
        return result;
    }
}

Time complexity : O(n²)
space complexity : O(1)