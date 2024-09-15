/*
Problem: https://leetcode.com/problems/4sum/
*/

// Approach 1: two-pointers but will fail if the input is large enough that sum of 4 numbers will not fit in int array
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) return result;
        Arrays.sort(nums);
        for (int first = 0; first < nums.length - 3; ++first) {
            if (first > 0 && nums[first - 1] == nums[first]) continue;   // Skip duplicate first picks.

            for (int second = first + 1; second < nums.length - 2; ++second) {
                if (second > first + 1 && nums[second - 1] == nums[second]) continue;   // Skip duplicate second picks.

                // 2Sum
                int third = second + 1, fourth = nums.length - 1;
                while (third < fourth) {
                    int sum = nums[first] + nums[second] + nums[third] + nums[fourth];
                    if (sum < target) {
                        third++;
                    } else if (sum > target) {
                        fourth--;
                    } else {
                        List<Integer> tuple = new ArrayList<>();
                        tuple.add(nums[first]); tuple.add(nums[second]); tuple.add(nums[third]); tuple.add(nums[fourth]); 
                        result.add(tuple);

                        third++;
                        --fourth;
                        while (third < fourth && nums[third - 1] == nums[third] ) third++;
                        while (third < fourth && nums[fourth + 1] == nums[fourth] ) --fourth;
                    }
                }
            }
        }
        return result;
    }
}


// Approach 2: two pointers that will work for sum that results in long type as well
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return kSum(nums, target, 0, 4);
    }
	
    public List<List<Integer>> kSum(int[] nums, long target, int start, int k) {
        List<List<Integer>> res = new ArrayList<>();

        // If we have run out of numbers to add, return res.
        if (start == nums.length) {
            return res;
        }
        
        // There are k remaining values to add to the sum. The 
        // average of these values is at least target / k.
        long average_value = target / k;
        
        // We cannot obtain a sum of target if the smallest value
        // in nums is greater than target / k or if the largest 
        // value in nums is smaller than target / k.
        if  (nums[start] > average_value || average_value > nums[nums.length - 1]) {
            return res;
        }
        
        if (k == 2) {
            return twoSum(nums, target, start);
        }
    
        for (int i = start; i < nums.length; ++i) {
            if (i == start || nums[i - 1] != nums[i]) {
                for (List<Integer> subset : kSum(nums, target - nums[i], i + 1, k - 1)) {
                    res.add(new ArrayList<>(Arrays.asList(nums[i])));
                    res.get(res.size() - 1).addAll(subset);
                }
            }
        }
    
        return res;
    }
	
    public List<List<Integer>> twoSum(int[] nums, long target, int start) {
        List<List<Integer>> res = new ArrayList<>();
        int lo = start, hi = nums.length - 1;
    
        while (lo < hi) {
            int currSum = nums[lo] + nums[hi];
            if (currSum < target || (lo > start && nums[lo] == nums[lo - 1])) {
                ++lo;
            } else if (currSum > target || (hi < nums.length - 1 && nums[hi] == nums[hi + 1])) {
                --hi;
            } else {
                res.add(Arrays.asList(nums[lo++], nums[hi--]));
            }
        }
                                                          
        return res;
    }
}