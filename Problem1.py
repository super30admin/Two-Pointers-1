"""
75. Sort Colors
Time Complexity - O(n)
Space Complexity - O(1)
Using 2 pointer approach set boundry for 0 and 2 and performed swapping and border update upon traversing yhe list
"""
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        left = 0
        right = len(nums)-1
        
        current = 0
        while(current <= right):
            if nums[current] == 0:
                nums[current],nums[left] = nums[left],nums[current]
                left += 1
                current += 1
            elif nums[current] == 1:
                current += 1
            else:
                nums[current],nums[right] = nums[right],nums[current]
                right -= 1
                
        
    
                