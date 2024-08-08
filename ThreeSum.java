// Problem 15. 3Sum
// Time Complexity : O(n*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        // Two Pointers
        for(int i=0; i < n-2; i++){
            // outside duplicates
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i] > 0){
                break;
            }
            int low = i+1;
            int high = n-1;
            while(low < high){
                int total = nums[i] + nums[low] + nums[high];
                if(total == 0){
                    List<Integer> triplet = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(triplet);
                    low++;
                    high--;
                    // as we are changing low and high above , we need to check base case for below while conditions
                    while(low < high && nums[low] == nums[low-1]){
                        low++;
                    }
                    while(low < high && nums[high] == nums[high+1]){
                        high--;
                    }
                }else if(total < 0){
                    low++;
                }else{
                    high--;
                }
            }
        }
        return result;
    }
}
