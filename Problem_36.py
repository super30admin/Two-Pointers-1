# TC: O(n^2)
# SC: Worst Case: O(n)

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums = sorted(nums)

        res = []
        for i in range(0, len(nums)-2):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            if nums[i] > 0:
                return res
                
            left = i + 1
            right = len(nums) - 1
            while left < right:
                total = nums[i] + nums[left] + nums[right]
                if total == 0:
                    res.append([nums[i], nums[left], nums[right]]) 
                    left += 1
                    right -= 1
                  
                    while (left < right and nums[left] == nums[left-1]):
                        left += 1

                elif total < 0:
                    left += 1
                else:
                    right -= 1

        return res