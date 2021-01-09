# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        #p0 left of p0 should always be 0
        p0 = 0
        #p2 right of p2 should always be 2
        p2 = len(nums) - 1
        curr = 0
        
        while curr <= p2:
            # check for 0
            if nums[curr] == 0:
                nums[curr], nums[p0] = nums[p0], nums[curr]
                p0 += 1
                curr += 1
            
            #check for 2
            elif nums[curr] == 2:
                nums[curr], nums[p2] = nums[p2], nums[curr]
                p2 -= 1
                
            else: 
                curr += 1
