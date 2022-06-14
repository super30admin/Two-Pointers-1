#// Time Complexity : O(N^2 logN)
# // Space Complexity : O(N)
# // Did this code successfully run on Leetcode : yes

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if len(nums) < 3:
            return []
        nums = sorted(nums)
        print(nums)
        output, i = set(), 0
        while i < len(nums) - 2:
            if nums[i] > 0:
                break
            if i > 0 and nums[i] == nums[i - 1]:
                i += 1
                continue
            l, r = i + 1, len(nums) - 1
            while (l < r):
                target = nums[l] + nums[r] + nums[i]
                if target == 0:
                    output.add((nums[l], nums[r], nums[i]))
                if target > 0:
                    r -= 1
                else:
                    l += 1
            i += 1
        return list(output)

