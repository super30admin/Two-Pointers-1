class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        #nlogn time and constant space
        nums.sort()
        result = []
        n = len(nums)
        for i in xrange(n):
            
            if i!=0 and nums[i] == nums[i-1]:
                continue
            if nums[i] > 0:
                break
            left = i + 1
            right = n - 1
            while left < right:
                cur_sum = nums[i] + nums[left] + nums[right]
                if cur_sum == 0:
                    result.append([nums[i], nums[left], nums[right]])
                    left += 1
                    right -= 1
                    while left < right and nums[left] == nums[left-1]:
                        left += 1
                    while left < right and nums[right] == nums[right+1]:
                        right -= 1
                elif cur_sum < 0:
                    left += 1
                else:
                    right -= 1
        return result
