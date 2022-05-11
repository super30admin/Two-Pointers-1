#Time complexity: O(n)
#Space complexity: O(1)
class Solution:
    def sortColors(self, nums) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low,high=0,len(nums)-1
        while low<=high:
            while low<len(nums) and nums[low]==0:
                low+=1
            while high>=0 and nums[high]!=0:
                high-=1
            if low<=high:
                nums[low],nums[high]=nums[high],nums[low]
            low+=1
            high-=1
        low,high=0,len(nums)-1
        while low<=high:
            while low<len(nums) and nums[low]!=2:
                low+=1
            while high>=0 and nums[high]!=1:
                high-=1
            if low<=high:
                nums[low],nums[high]=nums[high],nums[low]
            low+=1
            high-=1