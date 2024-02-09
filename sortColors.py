"""
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode :  yes 

At each step we calcualte hte area and comapre to the max area and return the maxarea once the 2 pointers cross each other 
// Your code here along with comments explaining your approach
"""


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums == None or len(nums) == 0:
            return
        low = 0
        mid = 0
        high = len(nums) - 1
        while mid <= high:
            if nums[mid] == 0:
                self.swap(nums, low, mid)
                low += 1
                mid += 1
            elif nums[mid] == 2:
                self.swap(nums, mid, high)
                high -= 1
            else:
                mid += 1

    def swap(self, nums: list[int], i: int, j: int):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
