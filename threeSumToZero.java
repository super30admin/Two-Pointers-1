/**
Problem: https://leetcode.com/problems/3sum/
TC: o(n^2)
SC: O(1)
*/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0 || nums.length < 3) {
            return result;
        }
        
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length - 2; ++i) {
            if (i > 0 && nums[i-1] == nums[i]) {
                continue;
            }
            int low = i + 1, high = nums.length - 1;

            while (low < high) {
                int target = nums[i] + nums[low] + nums[high];
                if (target == 0) {
                    
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]); l.add(nums[low]); l.add(nums[high]);
                    result.add(l);
                    
                    ++low;
                    --high;
                    
                    while (low < high && nums[low-1] == nums[low]) {
                        ++low;
                    }
                    while (low < high && nums[high+1] == nums[high]) {
                        --high;
                    }

                } else if (target < 0) {
                    ++low;
                } else {
                    --high;
                }
            }
        }
        return result;
    }
}