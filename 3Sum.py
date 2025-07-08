# Time Complexity: O(n^2)
# Space Complexity:O(1)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        # if not nums or len(nums)<3:
        #     return []

        result = []

        for i in range(len(nums)):
            if i != 0 and nums[i] == nums[i - 1]:
                continue
            if nums[i] > 0:
                break
            left = i + 1
            right = len(nums) - 1
            while left < right:
                total = nums[i] + nums[left] + nums[right]
                if total == 0:
                    result.append([nums[i], nums[left], nums[right]])
                    left += 1
                    right -= 1

                    while left < right and nums[left] == nums[left - 1]:
                        left += 1

                    while left < right and nums[right] == nums[right + 1]:
                        right -= 1

                elif total > 0:
                    right -= 1
                else:
                    left += 1
        return result

