/*
    Leetcode problem 75: Sort Colors 
    T.C: O(n) :: S.C: O(1)

    Solved using two pointers: We can compare the elements from left and right
    we need to swap the element that are > 1 at mid to the right and swap elements
    that are < 1 at mid to the left. The edge case here would be to not increment
    mid when swapping towards the right as the swapped element could be 1 which has
    to be swapped again with an element < 1. Rest of the code is straightforward.
    Mid is always greater than or equal to low and always lesser than or equal to high.
*/

class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int n = nums.length;
        int low = 0, high = n - 1, mid = 0;

        while (mid <= high) {
            if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            } else if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else { //Move mid if we get 1
                mid++;
            }
        }
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}