"""
Two-Pointers-1
Problem1 (https://leetcode.com/problems/sort-colors/)

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects 
of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.

Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Example 2:
Input: nums = [2,0,1]
Output: [0,1,2]
 
Constraints:
n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.
 
Follow up: Could you come up with a one-pass algorithm using only constant extra space?

Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Your code here along with comments explaining your approach:
Trick is to have 3 variables left, mid, right.
we start iterating over the array until mid doesn't exceed right. In this process we check if mid is 2 then we swap it with right
and decrement right and check mid again if it's 0 we swap it left and increment left and increment mid and check again. 
"""

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        if len(nums) == 0:
            return 0

        left, mid, right = 0, 0, len(nums)-1

        while mid <= right:
            if nums[mid] == 2:
                nums[mid], nums[right] = nums[right], nums[mid]
                right -= 1
            elif nums[mid] == 0:
                nums[mid], nums[left] = nums[left], nums[mid]
                mid += 1
                left += 1
            else:
                mid += 1
        


        
        
        