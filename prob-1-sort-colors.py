class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Time complexity: O(n) 
        Space complexity: O(1)
        Solution: 
        Did this code successfully run on Leetcode: Yes
        Any problem you faced while coding this: No        """
        lo = curr = 0
        hi = len(nums) - 1

        while curr <= hi: # Go through all values 
            if nums[curr] == 0:
                nums[lo], nums[curr] = nums[curr], nums[lo]
                lo += 1
                curr += 1
            elif nums[curr] == 2:
                nums[curr], nums[hi] = nums[hi], nums[curr]
                hi -= 1
                #DO NOT increment curr here - since we move a new element to the curr (from the hi)
            else:
                curr += 1

        
