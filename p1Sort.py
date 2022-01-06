"""
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.


// Time Complexity : O(N)
// Space Complexity : O(1) only storing 3 variables
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

"""
class Solution:
    def sortColors(self, nums: list[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        going to implement 3 pointer solution
        """
        low, mid, high = 0, 0, len(nums) - 1

        while mid <= high:
            #if arr[mid] ==2 swap mid and high, high--
            if nums[mid] == 2:
                temp = nums[mid]
                nums[mid] = nums[high]
                nums[high] = temp
                high -= 1
            elif nums[mid] == 0:   #if arr[mid] == 0 swap mid and low, low ++ mid++
                nums[low], nums[mid] = nums[mid], nums[low]
                mid += 1
                low += 1
            else: 
                mid += 1            #else if mid == 1, mid +11, 





            