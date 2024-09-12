# Time Complexity : Add - O(n^2)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode : Yes.

# Any problem you faced while coding this : No

'''
1. The 3 sum problem is projected as 2 sum problem, where the target element is projected as -1 * nums[i]
   Since x + y + z =0 -----> y + z = -x
2. So for for every unique element, I interpret it as a new target, and find a pair that together adds up to that target
'''

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        triplets = set()
        
        targets = {}
        
        for i in range(len(nums)):
            target = 0 - nums[i]
            
            comp_dict = {}
            if target not in targets:
                for j in range(i+1, len(nums)):
                    if target-nums[j] in comp_dict:
                        triples = sorted([nums[i], nums[j], nums[comp_dict[target-nums[j]]]])
                        triplets.add(tuple(triples))
                      
                    else:
                        comp_dict[nums[j]] = j
                
                targets[target] = i
                
                
        solution = list(map(lambda x : list(x),triplets))
        return solution
            