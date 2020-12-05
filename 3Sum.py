# Time: O(N^2)
# Space: O(N logN)

class Solution:
    def threeSum(self, nums):
        if len(nums) < 3: return []
        target = 0
        len_n = len(nums)
        result = set()
        nums.sort()

        for i in range(len_n - 2):
            if (i == 0 or nums[i] != nums[i - 1]) and nums[i] <= 0:
                left, right = i + 1, len_n - 1
                while left < right:
                    if nums[right] < 0:
                        break
                    sum_ = nums[i] + nums[left] + nums[right]
                    if sum_ > target:
                        right -= 1
                    elif sum_ < target:
                        left += 1
                    else:
                        result.add((nums[i], nums[left], nums[right]))
                        left += 1
                        right -= 1

        return result