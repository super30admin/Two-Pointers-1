# 75. Sort Colors

# Code:


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # left pointer 
        l = 0
        # right pointer 
        r = len(nums)-1
        # variable pointer
        curr = 0
        
        # Break condition current>right
        while curr<=r:
            # when we see a '0', swap left and curr. Increase curr and left by 1
            if nums[curr]==0:
                nums[curr], nums[l] = nums[l], nums[curr]
                curr+=1
                l+=1
            # When we see a '1', do nothing. Increase curr
            elif nums[curr]==1:
                curr+=1
            # When we see a '2', swap curr and right, decrease r by 1
            elif nums[curr]==2:
                nums[curr], nums[r] = nums[r], nums[curr]
                r-=1


# Time Complexity: O(N)
# Space Complexity: O(1)
# Accepted on Leetcode: YES
# Any problems faced: No.