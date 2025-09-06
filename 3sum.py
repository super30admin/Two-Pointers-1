# Time Complexity : O(N^2)
# Space Complexity : O(1)  
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach:
# I am sorting the input array to make it easier to find triplets that sum to zero.
# I then iterate through the array, using a two-pointer approach to find pairs that, along  with the current element, sum to zero.
# I also include checks to skip duplicate elements to ensure that the result contains only unique triplets.

from typing import List

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        sumy = []
        for i in range(len(nums)-2):
            if  i > 0 and nums[i] == nums[i-1]:
                continue
            left = i + 1 
            right = len(nums) - 1
            while left < right:
                curr = nums[i] + nums[left] + nums[right]
                if curr == 0:
                    sumy.append([nums[i] , nums[left] , nums[right]])
                    left += 1
                    right -= 1
                    while left < right and nums[left] == nums[left - 1]:
                        left += 1
                    while left < right and nums[right] == nums[right + 1]:
                        right += 1    
                elif curr > 0 :
                    right -= 1
                else:
                    left += 1
        return sumy



