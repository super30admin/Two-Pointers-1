# Time Complexity : O(n^2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Nope.


# Your code here along with comments explaining your approach
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        """
        Initial Thought:
            - Might need to sort the problem
            - Fix one Val and two sum the right two pointers.
                - if added values is > 0 decrease last pointer else increase second pointer
        """
        
        result = []
        nums.sort()
        for i in range(len(nums)-2):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            j = i + 1
            k = len(nums) - 1
        # two sum
            while j < k: #O(N)
                if nums[i] + nums[j] + nums[k] == 0:
                    result.append([nums[i],nums[j], nums[k]])
                    #duplicate checking
                    while j < k and nums[j] == nums[j+1]:
                        j += 1
                    while j < k and nums[k] == nums[k-1]:
                        k -= 1    
                    j += 1
                    k -= 1
                elif nums[i] + nums[j] + nums[k] > 0:
                    k -= 1
                else:
                    j += 1
        # end two sum
        return result
        
        
#   -1 0 1 2 -1 -4
#   i  j        k 
#   -4 -1 -1 0 1 2 