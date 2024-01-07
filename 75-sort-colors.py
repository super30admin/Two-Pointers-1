
"""
75. Sort Colors
Medium
"""
from leetcode_runner import LeetCode, TestCase, Args
from typing import *

PROBLEM = """
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
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

 
Follow up: Could you come up with a one-pass algorithm using only constant extra space?

"""

"""
Accepted
Time Complexity :  O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes 
Memory: 98%
Space: 18%

Explanation:
Dutch Algo - 1 pass
Maintain 3 pointers - left, mid, right. Move mid pointer from 0 to right.
If mid pointer is 0, swap mid and left pointers and increment both.
If mid pointer is 2, swap mid and right pointers and decrement right pointer.
If mid pointer is 1, increment mid pointer.

"""
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        l,m, r = 0, 0, len(nums)-1
        while m <= r: # m from 0 to right
            if  nums[m] == 0: # 0 found, send it to left
                temp = nums[l]
                nums[l] = 0
                nums[m] = temp
                l += 1
                m += 1
            elif nums[m] == 2: # 2 found, send it to right
                temp = nums[r]
                nums[r] = 2
                nums[m] = temp
                r -= 1
            else: # 1 found, just increment mid pointer
                m += 1
        # return nums
        pass

LeetCode(PROBLEM, Solution).check()
