// Time Complexity : O(N^2)
// Space Complexity : O(log(N))
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Sort the array. Take 3ptrs and calculate the sum of 2nd and third ptr and compare it with -1xfirstPtr.
// If sum is equal add it to result or else id sum is greater then decrement thrid pointer else increment end pointer if sum is less.
import java.util.*;
class ThreeSumSolution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length<=2)
            return new ArrayList<>();
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0; i < (nums.length-2); i++) {
            int j= i+1;
            int k = nums.length-1;
            while(j<k) {
                int sum = nums[j]+nums[k];
                if(sum == -(nums[i])) {
                    result.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                }
                else if(sum > -nums[i]) {
                    k--;
                } else if (sum < -nums[i]){
                    j++;
                }
            }
        }
        
        return new ArrayList<>(result);
    }
}