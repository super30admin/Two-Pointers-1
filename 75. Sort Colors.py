#Time Complexity:O(n)
#Space Complexity:O(1)

class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        low=0
        mid=0
        temp=0
        high=len(nums)-1
        while(low<=high):
            if low==2 and high==0:
                temp=nums[low]
                nums[low]=nums[high]
                nums[high]=temp
                low=low+1
                high=high-1
            if low==0:
                low=low+1
                mid=mid+1
            if high==2:
                high=high-1