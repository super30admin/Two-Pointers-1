# Time Complexity :
# O(n)

# Space Complexity :
# O(n)

# Did this code successfully run on Leetcode :
# Yes

# Three line explanation of solution in plain english

# We will maintain a hashmap and fill it with ements of array
# such that key will be element and value will be its index
# for each element we will find complement for sum, and we search this complement in hashamp
# If there is a complement in hashmap we will return index of element and complement


# Your code here along with comments explaining your approach

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        # Hashmap Solution - One Pass
        # TC: O(n)
        # SC: O(n)
        
        hm = {}
        complement = "a"
        
        for i in range(len(nums)):
            complement = hm.get(target - nums[i], "a")
            if(complement != "a" and complement != i):
                return [i, complement]
            
            hm[nums[i]] = i