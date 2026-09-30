# LEETCODE PROBLEM : 75. SORT COLORS
# TIME COMPLEXITY: O(N) where N is the number of elements in array
# SPACE COMPLEXITY: O(1) since we are not using any extra space and the work is 
# done on the given array itself


class Solution:
    def sortColors(self, nums: list[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low, mid=0,0
        high=len(nums)-1

        while mid<=high:
            if nums[mid]==0:
                nums[low],nums[mid]=nums[mid],nums[low]
                low+=1
                mid+=1
            elif nums[mid]==1:
                mid+=1
            else:
                nums[mid],nums[high]=nums[high],nums[mid]
                high-=1