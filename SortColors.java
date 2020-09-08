// Time Complexity : O(n)  where n is length of array, since we look at all the numbers just once
// Space Complexity : O(1) since we use constant space
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

// here we use 3 ptrs (left,curr,right).. 
// every iteration we check if the curr is 0 (swap curr with left) or 2(swap curr with right) 
// so after every iteration we know that whatever curr is holding we go to the right position but not about the swapped one (which is replaced in curr)
// initially we set left and right at index 0  and at every iteration if sum <0 move the ptr of smallest to ++ (i.e. left++) or
// if sum>0 right--..
//  breakin condition will be when curr>right (that means curr is know pointing to the element holding first 2.. hence sorted)
class Solution {
    public void sortColors(int[] nums) {

        if (nums == null || nums.length == 0)
            return;

        // conisder l keepin the track of last 0+1 and r keeping track of first 2 -1
        int l = 0, c = 0, r = nums.length - 1;

        while (c <= r) {
            if (nums[c] == 0) {
                swap(nums, c, l);
                c++;
                l++;
            } else if (nums[c] == 2) {
                swap(nums, c, r);
                r--;
            } else
                // this is 1 ..skip it
                c++;
        }

    }

    private void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}