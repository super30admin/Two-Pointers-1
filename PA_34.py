#LC 15 - 3Sum
#Time Complexity - O(n^2)
#Space Complexity - O(1)
class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if len(nums) < 3:
            return []
        i = 0
        nums = sorted(nums)
        ans = []
        #print(nums)
        for i in range(len(nums)-2):
            if i != 0 and nums[i-1] == nums[i]:
                continue
            if nums[i] > 0:
                break
            low = i + 1
            high = len(nums) - 1
            while low < high:
                tsum = nums[i] + nums[low] + nums[high]
                if tsum == 0:
                    #print(i,low,high)
                    ans.append([nums[i],nums[low],nums[high]])
                    while low < high and nums[low] == nums[low-1]:
                        low = low + 1
                    while low < high and nums[high] == nums[high-1]:
                        high = high - 1
                    high = high - 1
                elif tsum < 0:
                    low = low + 1
                else:
                    high = high - 1
        
        return ans