#Time Complexity - O(n)
#Space Complexity - O(1)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        left = 0
        x = 0
        right = len(nums) - 1
        
        while x <= right:
            while left < len(nums) and nums[left] == 0:
                left += 1
                x = left
            if x >= len(nums):
                break
            if nums[x] == 2 and  nums[right] != 0:
                nums[x], nums[right] = nums[right], nums[x]
                right -= 1
            elif nums[x] == 0 and left < len(nums):
                nums[x], nums[left] = nums[left], nums[x]
            else:
                x += 1
            