"""
Question Link: https://leetcode.com/problems/3sum/

"""
"""
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Example 2:

Input: nums = []
Output: []
Example 3:

Input: nums = [0]
Output: []
"""
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
	"""
    Sort the array.
    Take first element as target and find that numbers complement can be find in rest of the array or not.
    if found add into the array.
	"""
	# Run Time Complexity : O(N*N)+ O(NlogN) => O(N*N) 
	# Space Complexity: O(1) 
        nums = sorted(nums)
        
        output = set()
         
        for i in range(len(nums)):
            target = -nums[i]
            p_target = target
            j = i+1
            k = len(nums)-1
            while j<k:
                p_sum = nums[j] + nums[k]
                if p_sum == p_target:
                    output.add((nums[i], nums[j], nums[k]))
                    j = j+1
                    k = k-1
                if p_sum > p_target:
                    k = k-1
                if p_sum < p_target:
                    j = j+1
        return output