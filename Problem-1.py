# Time Complexity :O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no


# Your code here along with comments explaining your approach
#Use three pointers (low, mid, high) to partition the array into 0s, 1s, and 2s.
# When you see a 0, swap it to the front; when you see a 2, swap it to the end.
# Keep moving mid while shrinking the high side to sort everything in a single pass.

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low = mid =0
        high = len(nums)-1
        while mid <= high:
            if nums[mid] == 0:
                nums[low],nums[mid] = nums[mid],nums[low]
                low += 1
                mid += 1
            elif nums[mid] == 1:
                mid += 1
            else:
                nums[high],nums[mid] = nums[mid],nums[high]
                high -= 1


        
        