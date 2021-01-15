# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
# I use three pointers for this problem with 2 starting at 0 and 1 starting at end.
# mid is incremented all the time and if mid is 0 its swapped with 0 and we incement low
# if mid is 2 its swapped with high and swapped with high.
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low = 0
        mid = low
        high = len(nums) - 1
        
        while mid <= high:
            if nums[mid] == 1:
                mid += 1
            
            if mid <= high and nums[mid] == 0:
                self.swap(nums, mid, low)
                low+=1
                
            if mid <= high and nums[mid] == 2:
                self.swap(nums, mid, high)
                high -= 1
                
            mid = max(mid, low)

        return nums
    
    def swap(self, nums, one, other):
        temp = nums[one]
        nums[one] = nums[other]
        nums[other] = temp