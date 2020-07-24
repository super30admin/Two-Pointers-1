# APPROACH 1: Optimal Solution
# Time Complexity : O(n^2), n: length of nums
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. Sort the array - O(n lg n)
# 2. For each element of the array - first number, ensure it's not same as previous one.
# 3. Do Two sum like approach for second and third number.
# 4. If sum is 0, update second and third num such that they are not equal to previous and after elements respectively

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        if not nums or len(nums) < 3:
            return []
        
        result = []
        nums.sort()
        
        for first_ind in range(len(nums) - 2):
            if first_ind > 0 and nums[first_ind - 1] == nums[first_ind]:
                continue
                
            second_ind, third_ind =  first_ind + 1, len(nums) - 1
            
            while second_ind < third_ind:                
                curr_sum = nums[first_ind] + nums[second_ind] + nums[third_ind]
                
                if curr_sum == 0:
                    result.append([nums[first_ind], nums[second_ind], nums[third_ind]])
                    
                    second_ind += 1
                    while second_ind < third_ind and nums[second_ind - 1] == nums[second_ind]:
                        second_ind += 1
                        
                    third_ind -= 1
                    while second_ind < third_ind and nums[third_ind + 1] == nums[third_ind]:
                        third_ind -= 1
                    
                elif curr_sum < 0:
                    second_ind += 1
                    
                elif curr_sum > 0:
                    third_ind -= 1
                    
        return result
                        
                        
        
