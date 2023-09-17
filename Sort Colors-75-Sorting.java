class Solution {
    // Brute Force Approach
    // Time Complexity: O(n*log(n)) where n is number of elements in the nums array
    // Space Complexity: O(1) constant space
    public void sortColors(int[] nums) {
        if(nums.length==0 || nums==null)
        {
            return;
        }
        Arrays.sort(nums);
    }
}
