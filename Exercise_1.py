# Problem #34 Sort colors / Dutch flag
#LeetCode #75 https://leetcode.com/problems/sort-colors/description/

# Author : Akaash Trivedi
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode :  Yes #75
# Any problem you faced while coding this : No

#Approach:
# collect 1's with mid pointer, meaning when we get one we ignore
# on 2's we swap with right and on 0's we swap with left
# Never get 2's from the left, only 1's
# from right side we can get 1's or 2's so we dont increment mid

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l = 0
        m = 0
        r = len(nums) -1
        while m <= r:
            if nums[m] == 1:
                m +=1
            elif nums[m]==0:
                nums[l], nums[m] = nums[m], nums[l]
                m += 1
                l += 1
            else:
                nums[m], nums[r] = nums[r], nums[m]
                r -=1
            

        
