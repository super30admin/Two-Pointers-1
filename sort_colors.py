# Time Complexity: O(n) where n is the length of the array 
# Space Complexity:  O(1)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # low = 0
        # mid = 0
        # high = len(nums)-1
        # while(mid <= high):
        #     if nums[mid] == 0:
        #         nums[low], nums[mid] = nums[mid], nums[low]
        #         low +=1
        #         mid += 1
        #     elif nums[mid] == 2:
        #         nums[high], nums[mid] = nums[mid], nums[high]
        #         high -= 1
        #     else:
        #         # 1 case
        #         mid += 1

        low = 0
        mid = len(nums)-1
        high = len(nums)-1
        while(mid >= low):
            if nums[mid] == 0:
                nums[low], nums[mid] = nums[mid], nums[low]
                low +=1
                # mid += 1
            elif nums[mid] == 2:
                nums[high], nums[mid] = nums[mid], nums[high]
                high -= 1
                mid -= 1
            else:
                # 1 case
                mid -= 1
