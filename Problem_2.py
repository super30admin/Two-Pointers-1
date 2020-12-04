# 3Sum

# Time Complexity : O(N*N) 
# Space Complexity : O(N) 
# Did this code successfully run on Leetcode : Yes, Runtime: 692 ms and Memory Usage: 17.5 MB
# Any problem you faced while coding this : Initally yes, After class understanding no.
# Your code here along with comments explaining your approach
# Approach
"""
Using two pinter approach Set the low pointer to i + 1, and high pointer to the last index.
While low pointer is smaller than high If sum of nums[i] + nums[lo] + nums[hi] is less than zero, 
increment low else if sum is greater than zero, decrement high else a triplet is found
which is added to the result.Decrement high and increment low.
Increment low while the next value is the same as before to avoid duplicates in the result.
Return the result.

"""
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        nums.sort()
        for i in range(0,len(nums)-2):
            if nums[i] > 0:
                break
            if i == 0 or nums[i - 1] != nums[i]:
                self.twoSumII(nums, i, result)
        return result

    def twoSumII(self, nums: List[int], i: int, result: List[List[int]]):
        low=i+1 # Initializing 2 pointers
        high =len(nums) - 1
        while (low < high):
            sum = nums[i] + nums[low] + nums[high]
            if sum < 0: # Case1
                low =low+ 1 
            elif sum > 0: # Case 2
                high =high- 1
            else: # Case 3
                result.append([nums[i], nums[low], nums[high]])
                low =low+ 1