class Solution(object):
    def threeSum(self, nums):
        """
        Time complexity: O(n^3) Space complexity: O(k) where k is number of triplets
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res = set()
        n = len(nums)
        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                for k in range(j+1, len(nums)):
                    if (nums[i] + nums[j] + nums[k]) == 0:
                        triplet = tuple(sorted([nums[i], nums[j], nums[k]]))
                        res.add(triplet)
        
        return [list(t) for t in res]