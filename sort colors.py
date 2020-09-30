# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : no
# Any problem you faced while coding this : don't know how to do



class Solution:
    def sortColors(self, nums) -> None:
        
        l = 0
        r = len(nums)-1
        
        for i in range(len(nums)):
            if nums[i] == 0:
                nums[l],nums[i] = nums[i],nums[l]
                l += 1
            elif nums[i] == 2:
                nums[r],nums[i] = nums[i],nums[r]
                r -= 1
            print(nums)