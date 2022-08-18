class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        # Hashset TC - O(n**2) SC - O(n)
        result = []
        nums.sort()
        for i in range(len(nums)):
            if nums[i] > 0:
                break
            if i == 0 or nums[i - 1] != nums[i]:
                # self.twoSumII(nums,i,result)
                self.twoSum_seen(nums, i, result)
        return result

    def twoSum_seen(self, nums, i, result):
        seen = set()
        j = i + 1
        while j < len(nums):
            complement = -nums[i] - nums[j]
            if complement in seen:
                result.append([nums[i], nums[j], complement])
                while j + 1 < len(nums) and nums[j] == nums[j + 1]:
                    j += 1
            seen.add(nums[j])
            j += 1

    '''
    #  two pointer TC - O(n**2) SC - O(1)
    def twoSumII(self, nums, i, result):
        lo = i + 1
        hi = len(nums) - 1
        while lo < hi:
            sum = nums[i] + nums[lo] + nums[hi]
            if sum < 0:
                lo += 1
            elif sum > 0:
                hi -= 1
            elif sum == 0:
                result.append([nums[i], nums[lo], nums[hi]])
                lo += 1
                hi -= 1
                # use below line for eg. [-1 0 0 0 1 1]  
                # to avoid repeating pairs
                while lo < hi and nums[lo] == nums[lo - 1]:
                    lo += 1
    '''











