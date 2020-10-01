# Time Complexity: O(N^2)
# Space Complexity: O(N)
# Did not pass leetcode. Need to optimize further to handle duplicates

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        m = set(nums)
        out = []
        for i in range(len(nums)):
            
            for j in range(i + 1, len(nums)):
                
                curr = nums[i] + nums[j]
                
                if curr != 0:
                    curr = -curr
                    
                if curr in m:
                    out.append([nums[i], nums[j], curr])
        return out
                