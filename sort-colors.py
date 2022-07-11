"""
Runtime Complexity:
O(n) - because we traverse all the elements using 3 pointers low, mid and high respectively.
Space Complexity:
O(1) - no extra space was created to compute the solution.

The idea behind the algorithm is to set the pointers, low = 0, mid = 0 and high = len(nums). We check if nums[mid] ==0,
if it is then we swap with low with mid and increment low and mid. If nums[mid] ==1 we just increment mid because the elements left to mid would be lesser elements than the mid by this time else
we swap mid and high because we might find lesser elements to be sorted on the right part and 2 should always be pushed to the end. Therefore low< mid< high i.e, 0< 1< 2.
"""

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if len(nums)==0:
            return 
        low , high = 0, len(nums)-1
        mid = 0
        
        while(mid<=high):
            if nums[mid]==0:
                nums[low], nums[mid] = nums[mid], nums[low]
                low+=1
                mid+=1
            
            elif nums[mid]==1:
                mid+=1
            
            else:
                nums[mid], nums[high] = nums[high] , nums[mid]
                high-=1