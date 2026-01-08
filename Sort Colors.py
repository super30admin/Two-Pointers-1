#Time complexity - 0(n) & space complexity - o(1)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        if nums==None or len(nums)==0:
            return
        n= len(nums)
        low=0  # storing 0
        high= n-1 #storing  2
        mid = 0  # storing 1

        while mid<=high:
            if nums[mid]==0:
                nums[mid],nums[low]= nums[low], nums[mid]
                low=low+1
                mid=mid+1
            elif nums[mid]==1:
                mid = mid+1
            else:
                nums[mid],nums[high]=nums[high], nums[mid]
                high = high-1
            