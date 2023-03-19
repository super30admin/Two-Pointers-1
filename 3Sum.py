# Time Complexity :  O(n^2) nlogn for sort + n^2 for 2 pointers on n elements
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        i = 0
        result = []
        if nums[0] > 0:
            return result
        for i in range(len(nums)-2):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            left = i + 1
            right = len(nums) - 1
            while(left < right):
                s = nums[i] + nums[left] + nums[right]
                if s == 0:
                    result.append([nums[i],nums[left],nums[right]])
                    left += 1
                    right -= 1
                    while(left < right and nums[left] == nums[left-1]):
                        left += 1
                    while(left < right and nums[right] == nums[right+1]):
                        right -= 1
                elif s > 0:
                    right -= 1
                else:
                    left += 1
                
        return result
                        
