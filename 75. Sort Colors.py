"""
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Follow up:

Could you solve this problem without using the library's sort function?
Could you come up with a one-pass algorithm using only O(1) constant space?
 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
Example 3:

Input: nums = [0]
Output: [0]
"""
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
       Initialise the rightmost boundary of zeros : p0 = 0. During the algorithm execution nums[idx < p0] = 0.

		Initialise the leftmost boundary of twos : p2 = n - 1. During the algorithm execution nums[idx > p2] = 2.

		Initialise the index of current element to consider : curr = 0.

		While curr <= p2 :

		If nums[curr] = 0 : swap currth and p0th elements and move both pointers to the right.

		If nums[curr] = 2 : swap currth and p2th elements. Move pointer p2 to the left.

		If nums[curr] = 1 : move pointer curr to the right.
        """
        p1, curr, p2 = 0, 0, len(nums)-1
        while curr <= p2:
            if nums[curr] == 2:
                nums[p2], nums[curr] = nums[curr], nums[p2]
                p2 -= 1
            elif nums[curr] == 0:
                nums[curr], nums[p1] = nums[p1], nums[curr]
                p1 += 1
                curr += 1
            else:
                curr += 1
