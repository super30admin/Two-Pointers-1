# // Time Complexity : O(n) where n is the number of rows
# // Space Complexity : O(1) 
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : none

# // Your code here along with comments explaining your approach

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # two pass solution
        if len(nums) >= 2:
            i = 0
            j = len(nums)-1           
            # pass for 0
            while i < j:
                while i < j and nums[i] == 0:
                    i += 1
                while i < j and nums[j] != 0:
                    j -= 1
                if i < j:
                    nums[i],nums[j] = nums[j],nums[i]
                    i += 1
                    j -= 1

            # pass for 1
            j = len(nums)-1
            while i < j:
                while i < j and nums[i] <= 1:
                    i += 1
                while i < j and nums[j] == 2:
                    j -= 1
                if i < j:
                    nums[i],nums[j] = nums[j],nums[i]
                    i += 1
                    j -= 1
