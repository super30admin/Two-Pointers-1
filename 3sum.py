"""
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

Time Complexity : O(N^2)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

"""

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
      
        res = []
        # Sort the array to allow two-pointer traversal
        nums.sort()  

        for i, a in enumerate(nums):
            # Skip duplicate values for the first element
            if i > 0 and a == nums[i-1]:  
                continue

            l, r = i + 1, len(nums) - 1  # Two-pointer approach
            while l < r:
                total = a + nums[l] + nums[r]
                if total < 0:  
                    l += 1  # Move left pointer to increase the sum
                elif total > 0:
                    r -= 1  # Move right pointer to decrease the sum
                else:
                    res.append([a, nums[l], nums[r]])  # Found a triplet
                    l += 1  # Move left pointer to find next unique triplet
                    while l < r and nums[l] == nums[l - 1]:  # Skip duplicates
                        l += 1
        
        return res
