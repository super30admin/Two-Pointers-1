# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this :


# Your code here along with comments explaining your approach

'''
Using 3 pointers: left, right, and idx.
1. If idx finds 2 swap with right. Decrement right. DO NOT INCREMENT idx.
2. If idx finds a 0 swap with left. Increment left and increment idx. [0,0,0,...] if you do not incremenet
    i and L in this case your i will never move up.
3. If idx finds a 1. You can always increment idx. You never move the bounds. Hence, if 1 is in a bad place.
    It will get swapped out by a zero later.

'''




class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        
        left = 0
        right = len(nums) - 1
        idx = 0
        
        while idx <= right:
            if nums[idx] == 2:
                nums[idx], nums[right] = nums[right], nums[idx]
                right -=1
            
            elif nums[idx] == 0:
                nums[idx], nums[left] = nums[left], nums[idx]
                left += 1
                idx += 1
            
            elif nums[idx] == 1:
                idx += 1
            