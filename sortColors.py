"""
Intuition: Use 3 pointers as there are 3 types of elements
Assign each pointer for each kind of element.

L assigned to 0
M assigned to 1
H assigned to 2

And we iterate using M.
So if element at M == 2, that means we need to swap it with H
So if element at M == 0, that means we need to swap it with L
#####################################################################
Time Complexity : O(N)  N = number of elements
Space Complexity : O(1) 
#####################################################################
"""
class Solution:
    def sortColors(self, nums: List[int]) -> None:

        i = 0
        low = 0
        high = len(nums)-1
        
        while i <= high:
            if nums[i] == 0:
                nums[i], nums[low] = nums[low],  nums[i]
                i += 1
                low += 1
            elif nums[i] == 2:
                nums[i], nums[high] = nums[high],  nums[i]   
                high -=1
            elif nums[i] == 1:
                i += 1
            
        return nums