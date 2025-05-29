"""
Approach: sort the array use a start number and apply 2 sum on the rest of the array. two pointers to see if sum == 0.
t.c.=> O(n^2)
s.c. => O(1)
"""
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()

        n = len(nums)
        for start in range(n):
            if start > 0 and nums[start] == nums[start - 1]:
                continue
            if nums[start] > 0:
                break
            l, r = start + 1, n - 1
            while l < r:
                sums = nums[l] + nums[r] + nums[start]
                if sums == 0:
                    res.append([nums[start], nums[l], nums[r]])
                    r -= 1
                    while l < r and nums[r] == nums[r + 1]:
                        r -= 1
                elif sums > 0:
                    r -= 1
                else:
                    l += 1
        return res