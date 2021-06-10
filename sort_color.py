from typing import List


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if len(nums)==0:
            return 0
        left=0
        curr=0
        right=len(nums)-1
        while curr<=right:
            if nums[curr]==2:
                nums[curr],nums[right]=nums[right],nums[curr]
                right-=1
            elif nums[curr]==0:
                nums[curr],nums[left]=nums[left],nums[curr]
                left+=1
                curr+=1
            elif nums[curr]==1:
                curr+=1