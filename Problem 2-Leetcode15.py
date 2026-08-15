#Time complexity: O(n^2)
#Space complexity: O(1)

class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if len(nums) < 3:
            return []
            
        n = len(nums)
        nums.sort()
        result = []

        for i in range(n):
            if i != 0 and nums[i] == nums[i - 1]: continue
            if nums[i] > 0: break
            l, r = i + 1, n - 1

            while l < r:
                sum = nums[i] + nums[l] + nums[r]
                if sum == 0:
                    result.append([nums[i], nums[l], nums[r]])
                    l += 1
                    r -= 1
                    while l < r and nums[l] == nums[l - 1] : l += 1
                    while l < r and nums[r] == nums[r + 1] : r -= 1
                elif sum > 0:
                    r -= 1
                else:
                    l += 1
        
        return result
        