# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach - 1
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        white = 0
        red = 0
        blue = len(nums) - 1
        
        while white <= blue:
            if nums[white] == 0:
                nums[red], nums[white] = nums[white], nums[red]
                
                white += 1
                red += 1
            elif nums[white] == 1:
                white += 1
            else:
                nums[blue], nums[white] = nums[white], nums[blue]
                blue -= 1
        return nums
      
      
      
# Approach - 2

# class Solution:
#     def sortColors(self, nums: List[int]) -> None:
#         
#         for i in range(len(nums)):
#             for j in range(i+1, len(nums)):
#                 if nums[i] > nums[j]:
#                     nums[i], nums[j] = nums[j], nums[i]
#         return nums
