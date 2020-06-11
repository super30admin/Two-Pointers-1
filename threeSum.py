#15. 3Sum
#Time Complexity : O(n^2). 
# Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        if len(nums) < 3 or nums == []:
            return []
        nums.sort()
        for i in range(len(nums)-2):
            #handling outer duplicate
            if nums[i] > 0:
                break
            if i > 0 and nums[i] == nums[i-1]:
                continue
            low = i + 1
            high = len(nums)-1
            while low < high:
                sum = nums[i]+nums[low]+nums[high]
                if sum == 0:
                    l = [nums[i],nums[low],nums[high]]
                    res.append(l)
                    low = low + 1
                    high = high -1
                    # handling inner duplicates
                    while low < high and nums[low] == nums[low-1]:
                        low = low +1
                    while low < high and nums[high] == nums[high+1]:
                        high = high -1
                elif sum > 0:
                    high = high - 1
                else:
                    low = low + 1
                    
        return res
                    
                        