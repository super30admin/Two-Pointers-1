#TC: O(n)
#SC: O(1)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low,mid,high=0,0,len(nums)-1
        while mid<=high:
            if nums[mid]==2:
                nums[mid],nums[high]=nums[high],nums[mid]
                high-=1
            elif nums[mid]==0:
                nums[mid],nums[low]=nums[low],nums[mid]
                low+=1
                mid+=1
            else:
                mid+=1
        