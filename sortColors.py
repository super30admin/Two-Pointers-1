"""
75. Sort Colors

Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Time = O(n), n = number of elements in array
Space = constant = O(1)
Successfully excecuted on leetcode


Approach(move all 0's to front, 2's to end) -- 
1. Traverse from left to right, maintain the most recent position of 0 and the position of 2.
2. When 0 is encountered move to the left and for 2 move to right, increment/decrement the pointers accordingly
3. When 1 is encountered do nothing, increase the index

"""

class Sort:
    def sortColors(self, nums: List[int]) -> None:
        if len(nums) < 2:
            return
        left = 0
        right = len(nums)-1
        index = 0
        while index <= right and left<right:
            if nums[index] == 0:
                nums[index]=nums[start]
                nums[start] = 0
                left += 1
                index += 1
            elif nums[index] == 2:
                nums[index] = nums[end]
                nums[end] = 2
                right -= 1
            else:
                index += 1