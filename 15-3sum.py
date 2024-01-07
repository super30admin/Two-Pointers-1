
"""
15. 3Sum
Medium
"""
from leetcode_runner import LeetCode, TestCase, Args
from typing import *

PROBLEM = """
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.
 
Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.

Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.

Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.

 
Constraints:

3 <= nums.length <= 3000
-105 <= nums[i] <= 105


"""

class Solution:
    
    """
    Accepted
    Time Complexity :  O(n^2)
    Space Complexity : O(1)
    Did this code successfully run on Leetcode : Yes
    Runtime 56% 
    Memory  5% 
    
    Explanation: 2Sum + Two Pointers technique. Use a set to avoid duplicates.
    Need to sort the array first. Go through each number 
    and find the 2Sum for the rest of the array using two pointers.
    
    """
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        size = len(nums)
        res = set()
        for idx, i in enumerate(nums):
            target = 0 - i
            l, r = idx + 1, size -1 # start from next number and last number
            while l < r: # 2Sum using two pointers on a sorted array
                currSum = nums[l] + nums[r]
                if currSum > target:
                    r -= 1
                elif currSum < target:
                    l += 1
                else: # found the 2Sum, but there could be more than one pair. So, move both pointers
                    res.add((i, nums[l], nums[r]))
                    l += 1
                    r -= 1
                    # If it was just one pair, we could have just returned here. Like 2Sum II problem.
        return [list(i) for i in res]
    
    """
    Accepted
    Time Complexity :  O(n^2)
    Space Complexity : O(n)
    Did this code successfully run on Leetcode : Yes
    Runtime 15% | 2800ms
    Memory  5% | 23mb
    
    Explanation: 2Sum + Hashmap technique. Use a set to avoid duplicates. 
    Go through each number and find the 2Sum for the rest of the array. 
    """
    def threeSum2(self, nums: List[int]) -> List[List[int]]:
        dict = {}
        res = set()
        n = len(nums)
        for idx, i in enumerate(nums): # Value -> Index Dict
            dict[i] = idx
        for idx, i in enumerate(nums):
            target = 0 - i
            for jdx in range(idx + 1, n): # Become 2Sum here
                j = nums[jdx]
                if idx == jdx:
                    continue
                if target-j in dict and dict[target-j] != jdx and dict[target-j] != idx:
                    # Check the third number is present in the dict and it is not the same as the other two.
                    res.add( tuple(sorted([i, j, target-j])) ) # Add to set to avoid duplicates
        return [list(i) for i in res]
    

LeetCode(PROBLEM, Solution).check()
