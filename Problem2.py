#Time Complexity - O(n*n)
#Space Complexity - O(1)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        
        nums.sort()
        
        x = 0
        while x < len(nums):
            left = x + 1
            right = len(nums) - 1
            while left < right:
                if nums[x] + nums[left] + nums[right] == 0:
                    res.append([nums[x], nums[left], nums[right]])
                    while left + 1 < len(nums) and nums[left] == nums[left + 1]:
                        left += 1
                    left += 1
                    while right - 1 >= 0 and nums[right] == nums[right - 1]:
                        right -= 1
                elif nums[left] + nums[right] < (nums[x] * -1):
                    left += 1
                else:
                    right -= 1
            while x + 1 < len(nums) and nums[x] == nums[x + 1]:
                x += 1
            x += 1
        return res