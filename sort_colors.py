# // Time Complexity : O(n)
# // Space Complexity :O(n)
# // Did this code successfully run on Leetcode :
# // Any problem you faced while coding this :


# // Your code here along with comments explaining your approach

# maintain 3 pointers   low, mid  start from begining of array and high is end of the array 
# so we have 3 colors , if we encounter 2 , we put it in the back and high -- as 1 element is sorted
# if we encounter 0 with mid pointer then we swap mid and low as as 0's are sorted in the front part of arrray 
# the mid pointer collects 1's .


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low , mid = 0 , 0 
        high = len(nums) - 1

        while mid <= high:
            if nums[mid] == 2:
                nums[mid] , nums[high] = nums[high] ,nums[mid]
                high -= 1
            elif nums[mid] == 0:
                nums[low] , nums[mid] = nums[mid] , nums[low]
                low += 1
                mid += 1
            else: 
                mid += 1