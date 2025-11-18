## Problem1 (https://leetcode.com/problems/sort-colors/)
class Solution(object):
    def sortColors(self, nums):
        """
        Time complexity O(n) and space complexity O(1)
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        start = 0
        mid = 0
        end = len(nums) - 1

        while(mid<=end):
            if(nums[mid] == 0): 
                nums[start], nums[mid] = nums[mid], nums[start]
                mid+=1
                start+=1
                

            elif(nums[mid] == 1): 
                mid+=1
                

            else:
                nums[mid], nums[end] = nums[end], nums[mid]
                end-=1
                
    
        