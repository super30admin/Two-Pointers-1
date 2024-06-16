"""
Two-Pointers-1

Problem2 (https://leetcode.com/problems/3sum/)

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
-10^5 <= nums[i] <= 10^5


Time Complexity : O(n^2)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Your code here along with comments explaining your approach:
First we sort the elements and then iterate over the array to check if the current num is positive if yes we terminate the loop since positive number can't sum up to 0
else we continue we take our current ele as nums[i] and we apply two sum with left as i+1 and right as n-1. Now we apply two sum but we also add two additonal loops for 
left and right to make sure it's not the same element.
"""

# Approach 1 Brute force
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if not nums or len(nums) == 0:
            return []

        n = len(nums)
        result = []
        hash_set = set()

        for i in range(n):
            for j in range(i+1, n):
                for k in range(j+1, n):
                    if nums[i] + nums[j] + nums[k] == 0:
                        temp = [nums[i], nums[j], nums[k]]
                        temp.sort()
                        if tuple(temp) not in hash_set:
                            hash_set.add(tuple(temp))
                            result.append(temp)
        
        return result


# Approach 2 
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if not nums or len(nums) == 0:
            return []

        nums.sort()
        n = len(nums)
        result = []

        for i in range(n):
            if i != 0 and nums[i] == nums[i-1]:
                continue

            if nums[i] > 0: # since the elements are positive there cannot be a result
                break 
            left = i + 1
            right = len(nums) - 1

            while left < right:
                target = nums[i] + nums[left] + nums[right]

                if target == 0:
                    result.append([nums[i], nums[left], nums[right]])
                    left+=1 # to handle the left bounds
                    right-=1 # to handle the right bounds
                    while left < right and nums[left] == nums[left-1]:
                        left+=1
                    while left < right and nums[right] == nums[right+1]:
                        right-=1
                elif target > 0:
                    right -= 1
                else:
                    left += 1
            
        return result
                    
        

        
        
        