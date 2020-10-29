"""
Time complexity 0(n)

Space 0(1)

if mid is 1, then increase mid 
if mid is two , swap mid with high and decrease high 
if mid is 0, swap mid with low and increase mid and low pointer by 1. we need to increase mid as well in this case because mid and low can be in same location and it iterated on smae value.
"""
class Solution_sortcolor:
    def sortColors(self, nums: List[int]) -> None:
        if nums is None or len(nums)==0:
            return 
        """
        Do not return anything, modify nums in-place instead.
        """
        low=0
        mid=0
        high=len(nums)-1
        while(mid<=high):
            if(nums[mid]==1):
                mid=mid+1
            elif(nums[mid]==2):
                nums[mid],nums[high]=nums[high],nums[mid]
                high=high-1
            else:
                nums[mid],nums[low]=nums[low],nums[mid]
                low=low+1
                mid=mid+1
                