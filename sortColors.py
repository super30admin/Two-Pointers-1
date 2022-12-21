#Time Complexity: O(n)
#Space Complexity: O(1)
#Successfully ran on leetcode

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low,mid = 0,0
        high = len(nums)-1
        while mid<=high:
            if nums[mid]==2:
                nums[mid],nums[high] = nums[high],nums[mid]
                high-=1
            elif nums[mid]==0:
                nums[mid],nums[low] = nums[low],nums[mid]
                mid+=1
                low+=1
            else:
                mid+=1
        