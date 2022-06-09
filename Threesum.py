# Time Complexity: O(n^3)
# Space Complexity: O(1)
  
class Solution:
        
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = set()
        n = len(nums)
        if n < 3:
            return []
        for i in range(n-2):
            for j in range(i+1, n-1):
                for k in range(j+1, n):
                    if nums[i]+ nums[j]+nums[k] == 0:
                        subRes = [nums[i], nums[j], nums[k]]
                        subRes.sort()
                        res.add(tuple(subRes))
        return list(res)
        
        
        
        
        
        
