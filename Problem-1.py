## Problem1 (https://leetcode.com/problems/sort-colors/)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low = 0
        mid = 0
        high = len(nums)-1
        while mid<=high:
            if nums[mid]==1:
                mid=mid+1
            elif nums[mid] == 0:
                nums[mid],nums[low] = nums[low],nums[mid]
                low = low+1
                mid = mid+1
            else:
                nums[mid],nums[high] = nums[high],nums[mid] 
                high = high-1
        return nums
    
    # <!-- #Time Complexity: O(n) n = number of elements in the array 
    # #Space Complexity: O(1)
    # #Approach: Two pointer  -->
            