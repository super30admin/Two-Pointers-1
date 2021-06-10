class Solution:
    '''
    Time Complexity: O(n^2)
    Space Complexity: O(n)
    '''
    def threeSum(self, nums):
        # assert
        if len(nums) < 1: return []

        res = []
        nums.sort()

        keys = {}

        for i, a in enumerate(nums):
            if i > 0 and a == nums[i-1]:
                continue
            l, r = i + 1, len(nums) -1
            while l < r:
                three_sum = a + nums[l] + nums[r]
                if three_sum > 0:
                    r -= 1
                elif three_sum < 0:
                    l += 1
                else:
                    res.append([a, nums[l], nums[r]])
                    l += 1
                    while nums[l] == nums[l-1] and l < r:
                        l += 1
        return res