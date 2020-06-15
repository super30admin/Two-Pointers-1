

from typing import List

"""

    Student : Shahreen Shahjahan Psyche
    Time Complexity : O(N)
    Space Complexity : O(1)

"""

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        low = 0
        high = len(nums) - 1
        mid = 0
        
        # Taking 3 pointers. Low, mid and high. Mid should align with 1, low
        # with 0 and high with 2

        while(mid<=high):
            
            # if I get 1 in mid, I just increase the pointer
            if nums[mid] == 1:
                mid += 1
            # if I get 2 at mid, then I swap with high. 
            elif nums[mid] == 2:
                temp = nums[mid]
                nums[mid] = nums[high]
                nums[high] = temp
                high -= 1
            # or else, if I found 0 at mid, I swap it with low
            else:
                temp = nums[mid]
                nums[mid] = nums[low]
                nums[low] = temp
                
                mid += 1
                low += 1
                
            
            