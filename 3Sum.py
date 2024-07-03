# Time Complexity : O(n*n)
# Space Complexity : O(1)

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []

        nums.sort()
        n = len(nums)
        for i in range(n - 2):
            if nums[i] > 0:
                break
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            target = -nums[i]
            print(target)
            l = i + 1
            r = n - 1

            while l < r:
                sum = nums[l] + nums[r]
                if sum < target:
                    l += 1
                elif sum > target:
                    r -= 1
                else:
                    res.append([nums[i], nums[l] , nums[r]])
                    l += 1
                    r -= 1
                    while nums[l] == nums[l-1] and l < r:
                        l += 1
        return res
            