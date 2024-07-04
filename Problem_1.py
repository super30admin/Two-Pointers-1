"""
## Problem1 (https://leetcode.com/problems/sort-colors/)
"""
#TC: O(N)
#SC: O(1)
class Solution:
    # def swapPtr(self, nums, pt1, pt2):
    #     nums[pt1], nums[pt2] = nums[pt2], nums[pt1]
        
        
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        left_ptr = mid_ptr = 0
        right_ptr = len(nums) - 1
        
        while (mid_ptr <= right_ptr):
            
            if (nums[mid_ptr] == 2):
                nums[mid_ptr], nums[right_ptr] = nums[right_ptr], nums[mid_ptr]
                right_ptr -= 1
                
            elif (nums[mid_ptr] == 0):
                nums[mid_ptr], nums[left_ptr] = nums[left_ptr], nums[mid_ptr]
                left_ptr += 1
                mid_ptr += 1
                
            else:
                mid_ptr += 1
        