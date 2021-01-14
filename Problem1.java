// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
class Solution {
    public void sortColors(int[] nums) {
        int freq[] = new int[3];
        for (int e : nums) {
            freq[e]++;
        }
        int index = 0;
        for (int i = 0; i < 3; i++) {
            int frq = freq[i];
            while (frq-- > 0) {
                nums[index++] = i;
            }
        }
    }
}