# Brute Force Approach
# Time Complexity: O(n^3)
# Space Complexity: O(1)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        li = []
        subarraycount = 0
        if nums == None or len(nums) == 0:
            return res
        for i in range(len(nums) - 2):
            for j in range(i + 1, len(nums)):
                for k in range(j + 1, len(nums)):
                    Sum = nums[i] + nums[j] + nums[k]
                    if Sum == 0:
                        li = [nums[i], nums[j], nums[k]]
                        li.sort()
                        if li not in res:
                            res.append(li)

        return res