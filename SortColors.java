// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/* Take three pointers i for 0, j for 1 and K for 3, check if number at index j ==2 , swap it with number at index k
* if number at index j is 0 then swap it for number at index i */

class SortColors {
    public void sortColors(int[] nums) {

        int i = 0; // for number 0
        int j = 0; // for number 1
        int k = nums.length - 1;  // for number = 2

        while(j <= k) {
            if(nums[j] == 0) {
                swap(nums,j, i);
                i++;
                j++;
            }

            else if(nums[j] == 1)
                j++;

            else {
                swap(nums, j, k);
                k--;
            }
        }
    }

    void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}