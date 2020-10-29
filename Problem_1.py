"""
Time Complexity : O(n) 
Space Complexity : O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


Your code here along with comments explaining your approach:
This is a two pointer approach. If we bring all 0s to the left and all 2s to the right, then we do not need
to do anything with the 1s as they get sorted automatically. So we keep 3 pointers, left, mid and right.
Mid is just for traversing through the array. Left defines the position to keep 0s and right defines
the position to keep 2s. Whenever mid encounters any 0 , it swaps it with the position that left holds,
and in case of 2, it swaps it with position that right holds. We increment the pointers accordingly.
"""


class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        left, middle = 0, 0
        right = len(nums)-1
        while middle <= right:
            if nums[middle] == 0:
                nums[left], nums[middle] = nums[middle], nums[left]
                left += 1
                middle += 1
            elif nums[middle] == 2:
                nums[right], nums[middle] = nums[middle], nums[right]
                right -= 1
            else:
                middle += 1
        return nums
