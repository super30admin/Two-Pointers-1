"""Explanation: To sort the nums array, we take three pointers, low, mid and high. Low and mid start at the first index while high starts at
   the last index. Now, we iterate and compare the elements of the array. If the mid pointer at element == 0, we swap it with low pointer,
   otherwise we swap it with high if nums[mid] == 2. If nums[mid] == 1, we simply move the middle pointer. 
   Time Complexcity: O(n)
   Space Complexcity:O(1)
"""

class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        low = 0
        high = len(nums)-1
        mid = 0

        while(mid <= high):

            #check for mid first
            if(nums[mid] == 0):
                nums[low], nums[mid] = nums[mid], nums[low]
                low += 1
                mid += 1
            elif(nums[mid] == 1):
                mid += 1
            else:
                nums[high], nums[mid] = nums[mid], nums[high]
                high -= 1