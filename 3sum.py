# Time Complexity: O(n^2) where n is the number of elements in array
# Space Complexity: O(1) if output array is not considered as extra space
# Ran on Leetcode: Yes

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        out = []
        n = len(nums)
        if not n:
            return out
        nums.sort()
        for i in range(n - 2):
            lo = i + 1
            hi = n - 1
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            while lo < hi:
                s = nums[i] + nums[lo] + nums[hi]
                if s  == 0:
                    out.append([nums[i], nums[lo], nums[hi]])
                    lo += 1
                    hi -= 1
                    while lo < hi and nums[lo] == nums[lo - 1]:
                        lo += 1
                    while lo < hi and nums[hi] == nums[hi + 1]:
                        hi -= 1
                elif s > 0:
                    hi -= 1
                else:
                    lo += 1            
            
        return out
