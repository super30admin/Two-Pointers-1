# // Time Complexity : O(n*n) where n is the number of elements
# // Space Complexity : O(1) where n is the number of rows
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : none

# // Your code here along with comments explaining your approach

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        res = set()
        i = 0
        while i < len(nums)-2:
            target = -nums[i]
            j = i+1
            k = len(nums)-1
            while j < k:
                sumx = nums[j] + nums[k]
                if sumx < target: 
                    j += 1
                    while j < len(nums) and nums[j] == nums[j-1]:
                        j += 1
                elif sumx > target: 
                    k -= 1
                    while k >= 0 and nums[k] == nums[k+1]:
                        k -= 1
                else: 
                    res.add((nums[i],nums[j],nums[k]))
                    j += 1
                    k -= 1
            i += 1
            while i < len(nums) - 2 and nums[i] == nums[i-1]:
                i += 1
        return res
            
                
              