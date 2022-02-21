# Time Complexity = O(n) 
# Space Complexity = O(n) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
                
        res, dups = set(), set()
        seen = {}
        for i, val1 in enumerate(nums):
            
            # to skip duplicates
            if val1 not in dups:
                
                # adds element one time 
                dups.add(val1)
                
                # iterating from i+1
                for j, val2 in enumerate(nums[i+1:]):
                    
                    # calculate complement
                    complement = -val1 - val2
                    
                    # if complement exists add to the set as tuple
                    if complement in seen and seen[complement] == i:
                        res.add(tuple(sorted((val1, val2, complement))))
                        
                    # add the values to the hashmap
                    seen[val2] = i
        return res