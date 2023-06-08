# Time Complexity : O(n^2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# We sort the array and loop through each element (call it the first element)
# Then to find the other two possible number of the triplet, we perform a 
# 2sum search in the leftover range using 2 pointers (O(n) for each 2sum operation).

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums = sorted(nums)
        a = 0
        res = []
        while a < (len(nums)-2):
            pairs = self.twoP(nums, a, a+1, len(nums)-1, -nums[a])
            if pairs:
                for pair in pairs:
                    res.append((nums[a], pair[0], pair[1],))
            a += 1
            while a < len(nums)-2 and nums[a] == nums[a-1]:
                a += 1
        return res

    def twoP(self, nums, a, l, r, target):
        res = []
        while l < r:
            if nums[l] + nums[r] == target:
                res.append((nums[l], nums[r]))
                r -= 1
                l += 1
                while r > a and nums[r] == nums[r+1]:
                    r -= 1
                while l < len(nums)-1 and nums[l] == nums[l-1]:
                    l += 1
            elif nums[l] + nums[r] < target:
                l += 1
            else:
                r -= 1
        return res


            

