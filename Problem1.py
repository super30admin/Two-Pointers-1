# Leetcode 75 - Sort Colors
# Time - O(n)
# Space - O(1)

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        left = 0
        mid = 0
        right = len(nums) -1 
        
        while(mid <= right):
            
            if nums[mid] == 1:
                
                mid = mid + 1
            
            elif nums[mid] == 0:
                
                # nums[mid] , nums[left] = nums[left] , nums[mid]
                nums[left] , nums[mid] = nums[mid] , nums[left]
                
                left = left + 1
                mid = mid + 1
            else:
                
                # nums[mid] ,nums[right] = nums[right] , nums[mid]
                nums[right] , nums[mid] = nums[mid] , nums[right]
                right = right - 1
        
        return nums