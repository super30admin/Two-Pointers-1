'''https://leetcode.com/problems/3sum/
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
'''

# Time Complexity : O(N^2 + NlogN) = O(N^2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def threeSum(self, nums: 'list[int]') -> 'list[list[int]]':
        if nums is None or len(nums) < 3: return []
        
        result = []
        
        # 2 pointers technique
        nums = sorted(nums)
        for i in range(len(nums)-2):
            if i > 0 and nums[i] == nums[i-1]: # prevent duplicates
                continue
                
            j = i+1
            k = len(nums)-1 
            
            while j < k:
                t = nums[i]+nums[j]+nums[k]
                if t == 0:
                    result.append([nums[i], nums[j], nums[k]])
                    j += 1
                    k -= 1
                    while j < k and nums[j] == nums[j-1]:  # prevent duplicates
                        j += 1
                    while j < k and nums[k] == nums[k+1]:  # prevent duplicates
                        k -= 1
                elif t < 0:
                    j += 1
                else:
                    k -= 1
            
        return result
            
            
            
        