## Problem1 (https://leetcode.com/problems/sort-colors/)
# Time Complexity - O(n)
# Space Complexity - O(1)


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if not nums:
            return
        
        def swap(nums, x, y):
            temp = nums[y]
            nums[y] = nums[x]
            nums[x] = temp
        
        i = 0
        j = len(nums)-1
        curr = 0
        
        while(curr <= j):
            if nums[curr] == 0:
                if(curr == i):
                    curr+=1
                    i+=1
                else:
                    swap(nums,i,curr)
                    i+=1
            elif nums[curr] == 2:
                swap(nums,curr,j)
                j-=1
            else:
                curr+=1
        
        
                
             
        