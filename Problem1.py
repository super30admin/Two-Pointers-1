# Time Complexity: O(N)
# Space Complexity: O(1)
# Passed Leetcode. 
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        left = 0
        right = len(nums) -  1
        curr = 0
        while curr <= right:
            if nums[curr] == 0:
                temp = nums[left]
                nums[left] = nums[curr]
                nums[curr] = temp
                left += 1
                curr += 1
            elif nums[curr] == 2:
                temp = nums[right]
                nums[right] = nums[curr]
                nums[curr] = temp
                right -= 1
            
            else:
            
                curr += 1
                
        
            
            
        
                
                
            
                
        
            
            
        
                
                
            