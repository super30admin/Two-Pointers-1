#Time Complexity O(N2)
#Space Complexity O(N)

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res, dups = set(), set()
        seen = {}
        for i, val1 in enumerate(nums):
            if val1 not in dups:
                dups.add(val1)
                for j, val2 in enumerate(nums[i+1:]):
                    complement = -val1 - val2
                    if complement in seen and seen[complement] == i:
                        u_val = sorted((val1, val2, complement))
                        tuple_element2 = tuple(u_val)
                        res.add(tuple_element2)
                    seen[val2] = i
        return res
                        
                    
                
            
            
        
        
        
