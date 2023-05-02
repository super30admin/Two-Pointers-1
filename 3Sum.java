// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * We looked at brute force, binary search. We then tried 2 pointers approach for TWO POINTERS we need to sort it.
 * For each index, we put 1. low pointer at i + 1 and 2. at last index n - 1. We run a loop while low < high and check 3 conditions:
 * 1. Sum = 0; add to result and move low and high also move low and high if nums[low] or nums[high] were already checked.
 * 2. if sum > 0  we need smaller and move high else move low.  
 */

public class 3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 1) {
            return new ArrayList<>();
        }
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(nums[i] > 0) {
                break;
            }
            if(i != 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int low = i + 1;
            int high = n - 1;
            while(low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                    while(low < high && nums[low] == nums[low-1] && nums[high] == nums[high+1]) {
                        low++;
                        high--;
                    }
                    
                } 
                else if(sum > 0) {
                    high--;
                }
                else {
                    low++;
                }
            }
        }
        return result;
    }
}
