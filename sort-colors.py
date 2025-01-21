"""

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Time Complexity : O(N)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

"""

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        Dutch National Flag Algorithm:
        - Uses three pointers: `l` (left), `curr` (current), and `r` (right).
        - `l` tracks the position to place `0`s.
        - `r` tracks the position to place `2`s.
        - `curr` iterates through the list and sorts the elements in-place.
        """

        l, curr = 0, 0
        r = len(nums) - 1

        while curr <= r:
            if nums[curr] == 0:
                # Swap 0 to the left partition and move both pointers
                nums[l], nums[curr] = nums[curr], nums[l]
                l += 1
                curr += 1
            elif nums[curr] == 2:
                # Swap 2 to the right partition and move `r` pointer only
                nums[r], nums[curr] = nums[curr], nums[r]
                r -= 1
            else:
                # If 1, just move `curr` forward
                curr += 1
