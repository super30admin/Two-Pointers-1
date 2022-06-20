# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this :No
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low=0
        mid=0
        high=len(nums)-1
        
        if len(nums)==None or len(nums)==1:
            return 
        
        while mid<=high:
            print("mid=", mid)
            if nums[mid]==2:
                nums[mid],nums[high]=nums[high],nums[mid]
                high-=1
            if mid<=high and nums[mid]==1:
                mid+=1
            if mid<=high and nums[mid]==0:
                nums[mid],nums[low]=nums[low],nums[mid]
                low+=1
                mid+=1
        