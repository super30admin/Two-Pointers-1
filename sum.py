"""
TC: O(nlogn) + o(n^2) to sort the array + find 2sum n times
SP:O(n) 
"""
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        def twoSum(arr, target):
            hset = set()
            res = []
            for a in arr:
                if target - a in hset:
                    res.append([target-a, a])
                hset.add(a)
            return res
        res = set()
        nums.sort()
        for i in range(len(nums)-2):
            t = twoSum(nums[i+1:], -nums[i])
            if t:
                for p in t:
                    res.add((nums[i], p[0], p[1]))
        return list(res)
        