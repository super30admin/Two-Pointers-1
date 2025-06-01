// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : No for approach 1, Yes for approach 2

class Problem1 {
    public void sortColors(int[] nums) {
        // Approach 1
        // int zero = 0, one = 0, two = 0;
        // for (int num : nums) {
        //     if (num == 0) zero++;
        //     else if (num == 1) one++;
        //     else two++;
        // }

        // for (int i = 0; i < nums.length; i++) {
        //     if (zero > 0) { 
        //         nums[i] = 0;
        //         zero--;
        //     } else if (one > 0) {
        //         nums[i] = 1;
        //         one--;
        //     } else {
        //         nums[i] = 2;
        //         two--;
        //     }
        // }
// -------------------------------------------------------------
        // Approach 2 : 3 pointer (Dutch National Flag)
        // Initialize each color with index position
        int red = 0, white = 0, blue = nums.length - 1;
        
        while (white <= blue) {
            if (nums[white] == 0) {
                int temp = nums[red];
                nums[red] = nums[white];
                nums[white] = temp;
                red++;
                white++; 
            } else if (nums[white] == 1) {
                white++;
            } else {
                int temp = nums[white];
                nums[white] = nums[blue];
                nums[blue] = temp;
                blue--;
            }
        }

    }
}