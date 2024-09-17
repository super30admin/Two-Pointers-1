"""
# Two-Pointers-1

## Problem1 (https://leetcode.com/problems/sort-colors/)
Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note: You are not suppose to use the library's sort function for this problem.

Example:

Input: [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : No


"""
# the idea is to swap the current element with element at high if current element =2
# swap the current element with element at low if current element =0
# 1 will automatically come in middle
def Sortcolors(nums):
    left = 0    # 1st pointer at starting of array
    right = len(nums) - 1   # 2nd pointer at end of array
    curr = 0   # pointer to keep track of current element of array
    while left < right and curr <= right:
        if nums[curr] == 0:
            nums[left], nums[curr] = nums[curr], nums[left]  # swap to get 0 at starting
            left += 1
            curr = curr + 1
        elif nums[curr] == 2:
            nums[curr], nums[right] = nums[right], nums[curr]    # swap to get 2 at last
            right -= 1
        else:
            curr = curr + 1     # for 1 . jus move the cursor by 1

print(Sortcolors([0,0,1,1,2,2]))



