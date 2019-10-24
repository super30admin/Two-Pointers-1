class Solution:
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if len(nums) < 3:
            return []
        nums.sort()
        res = set()
        for i, v in enumerate(nums[:-2]): # i from 0 to len-2
            if i >= 1 and v == nums[i-1]:
                continue
            d = {}
            for x in nums[i+1:]:            # j from i+1 to len-1
                if x not in d:
                    d[-v-x] = 1             # what number we want in that iteration is added to dictionary
                else:
                    res.add((v, -v-x, x))
        return list(map(list, res))
