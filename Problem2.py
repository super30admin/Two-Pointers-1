# Time Complexity : O(n^2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no
# Problem Name: 3sum

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        result = []
        nums.sort()
        for i in range(n-2):
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            low = i + 1
            high = n -1
            while low < high:
                if nums[i] + nums[low] + nums[high] == 0:
                    result.append([nums[i],nums[low],nums[high]])
                    low += 1
                    high -= 1
                    while low < high and nums[low] == nums[low-1]:
                        low += 1
                    while low < high and nums[high] == nums[high+1]:
                        low += 1
                elif nums[i] + nums[low] + nums[high] < 0:
                    low += 1
                else:
                    high -= 1
        
        return result