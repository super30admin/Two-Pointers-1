// Time Complexity : O(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class SortColors {
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        for (int num : nums){
            if (num == 0) red++;
            if (num == 1) white++;
        }
        for (int i=0;i<nums.length;i++){
            if (red > 0){
                nums[i] = 0;
                red--;
            } else if (white > 0){
                nums[i] = 1;
                white--;
            } else {
                nums[i] = 2;
            }
        }
    }
}