// Time Complexity O(n^2) because sorting is smaller nlogn
// Space Complexity O(1) no extra space needed apart from output 

// We can sort the array in place followed by a 2 pointer approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        // we have a sorted array now

        for (int i = 0; i < nums.length; i++) {
            // outer loop
            int target = -nums[i]; // this is the target we want to find with our 2 pointer approach
            if (i > 0 && nums[i] == nums[i-1]) continue; // skip if we get a similar start element, to skip duplicates
            int p1 = i+1, p2 = nums.length-1;
            while (p1 < p2) {
                if (p1>i+1 && nums[p1] == nums[p1-1]) {
                    p1++; // skip if we get a similar element as previous p1, to skip duplicates
                    continue;
                }
                int currSum = nums[p1] + nums[p2];
                if (currSum > target) {
                    p2--;
                } else if (currSum < target) {
                    p1++;
                } else {
                    result.add(List.of(nums[i], nums[p1], nums[p2]));
                    p1++;
                    p2--;
                }
            }
            
        }
        return result;
    }
}
