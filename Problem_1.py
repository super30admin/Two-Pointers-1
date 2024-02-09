#
# @lc app=leetcode id=75 lang=python3
#
# [75] Sort Colors
#

# @lc code=start
'''
Time Complexity - O(n). We are iterating the entire array only once
Space Complexity - O(1), We are using extra variables

This code works on leetcode
'''
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low, mid, high =0, 0, len(nums)-1 #set low and mid to 0 and high to last index
        
        while mid <= high:
            if nums[mid]==2:
                nums[mid], nums[high] = nums[high], nums[mid] #swap elements at mid and high if we find a 2 at mid
                high-=1 #element at high is fixed move one index to left
            elif nums[mid] == 0: 
                nums[low], nums[mid] = nums[mid], nums[low] #swap elements at mid and low if we find a 0 at mid
                low+=1 #element at low is fixed moce one index to right
                mid+=1 #move mid to right as well else we may not move mid at all
            else:
                mid+=1
        
# @lc code=end

