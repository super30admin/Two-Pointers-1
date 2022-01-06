# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if not nums or len(nums) < 3:
            return []
        result = []
        hashmap = {}
        for i in range(len(nums)):
            val1 = nums[i]
            for val in range(i, len(nums)):
                if hashmap.has_key((-1*nums[val])-val1):
                    result.append([nums[i], nums[val], (-1*nums[val])-val1])
                    hashmap.pop((-1*nums[val])-val1)
                else:
                    hashmap[nums[val]] = val
        return (result)
