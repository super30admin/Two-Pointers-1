// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class SortColors {
    public void sortColors(int[] nums) {
        int zeros = 0, ones = 0, twos = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) zeros++;
            else if(nums[i] == 1) ones++;
            else twos++;
        }
        for(int i = 0; i < nums.length; i++){
            if(zeros != 0){
                nums[i] = 0;
                zeros--;
            } else if (zeros == 0 && ones != 0){
                nums[i] = 1;
                ones--;
            } else {
                nums[i] = 2;
                twos--;
            }
        }
    }
}