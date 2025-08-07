// Time Complexity : O(n²) 
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : Yes

// Approach:
// 1. Sort the array to handle duplicates and efficiently find triplets using two pointers.
// 2. For each element nums[i], use two pointers (left and right) to find the remaining two elements that sum up to zero.
// 3. Skip duplicates by checking consecutive elements for i, left, and right to ensure unique triplets.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3) return new ArrayList<>();

        HashSet<List<Integer>> result = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);

        for(int i = 0; i < n - 2; i++){
            int left = i + 1;
            int right = n - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }else if(sum < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
