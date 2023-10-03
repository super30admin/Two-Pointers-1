#Time Complexity : O(n) since we iterate through the list
#Space Complexity : O(1) since we are not using any extra space
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this :No

#Approach: We use two pointers (low and high) and a mid pointer. if nums[mid] is 2 we swap mid and high and decrement high by 1. 
# If nums[mid] is 0, we swap mid and low and increment low and mid by 1. Else just increment mid by 1. 

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        if n == 0: return
        l = 0
        mid = 0
        h = n-1
        while mid <= h:
            if nums[mid] == 2:
                self.swap(nums, mid, h)
                h -= 1
            elif nums[mid] == 0:
                self.swap(nums, mid, l)
                l += 1
                mid += 1
            else:
                mid += 1

    def swap(self, nums, i, j):
        if i == j: return
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
        