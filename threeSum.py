#                for sorting 
# Time Complexity: O(nlogn) + O(n^2) = O(n^2)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach:
# 1. We sort the array for easy traversal
# 2. For each element, we initialize low and high pointers, and check the sum of all elements.
# 3. If the sum is less than 0 we increment the low pointer, if it is greater, we decrement the high pointer
# 4. If the sum is 0, we store the triplet in the result array.
# 5. If we have already encountered an element before, we skip it, in order to avoid duplicates
from typing import List
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # We will implement the two-pointers approach
        # Initialize the result array
        res = []
        # Sort the input array for easy traversal
        nums.sort()
        n = len(nums)
        for i in range(n):
            # if we are encountering a duplicate, we want to skip it
            if i > 0 and nums[i] == nums[i-1]:
                continue
            # Initialize high and low pointers
            l, h = i+1, n-1
            # Keep calculating sum while low and high have not crossed each other
            while l < h:
                # If the sum of all 3 elements is 0, we found a valid triplet. We store the triplet in the result array.
                if nums[i] + nums[l] + nums[h] == 0:
                    res.append([nums[i], nums[l], nums[h]])
                    # We increment the left pointer
                    l += 1
                    # To avoid further duplicate paris of high and low, we keep incrementing the low pointers until we find a unique element
                    while l > 0 and l < n and nums[l] == nums[l-1]:
                        l += 1
                # If the sum is less than 0, we increment low pointer
                elif nums[i] + nums[l] + nums[h] < 0:
                    l += 1
                # If the sum is greater than 0, we decrement the high pointer
                else:
                    h -= 1
        # Finally, return the result array containing the triplets
        return res