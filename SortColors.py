"""
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
"""
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if len(nums) == 1:
            return nums
        # Initialize 3 pointers to traverse
        low = 0
        mid = 0
        high = len(nums) - 1
        # While my mid which should have value 1 is lower
        # we loop through the nums array
        while mid <= high:
            # Swap because my mid is not equal 1
            if nums[mid] == 0:
                self.swap(nums, mid, low)
                low += 1
                mid += 1
            # Increment mid because we found 1
            elif nums[mid] == 1:
                mid += 1
            # Swap because my mid is 2 and not 1
            else:
                self.swap(nums, high, mid)
                high -= 1
        return nums
    def swap(self, nums: List[int], a: int, b: int):
        temp = nums[a]
        nums[a] = nums[b]
        nums[b] = temp
        
                
                