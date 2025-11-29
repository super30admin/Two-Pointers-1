// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
I use three pointers—i for placing 0s, k for placing 2s, and j to scan through the array.
When I see a 0, I swap it to the front and move both i and j; when I see a 2, I swap it to the end and move only k, since 0 may be swapped and I still need to swap it with i in the next iteration
If it’s a 1, I just move j forward since 1s naturally settle in the middle.
*/

public class Problem1 {
    public void sortColors(int[] nums) {
        int i = 0;
        int k = nums.length-1;
        int j = i;


        while(j <= k) {
            if(nums[j] == 0) {
                swap(i,j, nums);
                i++;
                j++;
            } else if(nums[j] == 2) {
                swap(j,k, nums);
                k--;
            } else {
                j++;
            }
        }
    }

    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
