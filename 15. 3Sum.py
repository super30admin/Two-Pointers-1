# Time Complexity O(n*2)
# Space Complexity O(nlogn)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        ans = []
        nums.sort()
        for i, each in enumerate(nums):
            if i > 0 and nums[i] == nums[i - 1]:
                pass

            target = each

            l, r = i + 1, len(nums) - 1
            while l < r:
                if target + nums[l] + nums[r] > 0:
                    r -= 1
                elif target + nums[l] + nums[r] < 0:
                    l += 1
                else:
                    if [target, nums[l], nums[r]] not in ans:
                        ans.append([target, nums[l], nums[r]])
                    l += 1
                    while nums[l] == nums[l - 1] and l < r:
                        l += 1

        return ans