# Problem 2 - 3Sum
# Time Complexity : O(n^2)
# Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this :
'''
The main challenge I encountered in this problem was handling duplicate triplets, specifically avoiding counting the same 
triplet more than once. Sorting the array helped resolve this issue.
'''

# Your code here along with comments explaining your approach
from typing import List

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # Sort the number 
        nums.sort()
        length = len(nums)
        # Result variable to store triplets
        triplets = []
        # if length is less than 3 return enpty triplet
        if length < 3: 
            return triplets
        # Iterate through loop
        for i in range(length-2):
            # If number is greater than 0 then then there no triplet whose sum is 0.
            if nums[i] > 0:
                break
            # Skip the duplicate element
            if i > 0 and nums[i] == nums[i-1]:
                continue
            # Two pointer to find the pair of the number
            left = i+1
            right = length-1
            # loop until left does not cross right pointer
            while left < right:
                # Calculate current sum of the triplet
                currentSum = nums[i]+nums[left]+nums[right]
                # If sum is greater than 0 then decrement right pointer
                if currentSum > 0:
                    right -= 1
                # If sum is less than 0 then increment left pointer
                elif currentSum < 0:
                    left += 1
                # Is sum is zero then it is valid triplet
                else:
                    # append the triplet to the result variable
                    triplets.append([nums[i], nums[left], nums[right]])
                    # Increment left and decrement right pointer
                    left += 1
                    right -= 1
                    # Incrememt the left pointer till unique element is found to skip the duplicate
                    while left < right and nums[left] == nums[left-1]:
                        left += 1
                    # Decrement the right pointer till unique element is found to skip the duplicate
                    while left < right and nums[right] == nums[right+1]:
                        right -= 1
        return triplets