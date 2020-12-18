# TC : O(n)
# SC : O(1)
# Approach : Keep three variables, low for 0, mid for 1, high for 2. while mid <= high, we check if 
# nums[mid]==0 we swap low with mid, and increment both, if nums[mid]==1, we increment mid only, as we 
# want all 1s between 0s and 2s only. If nums[mid] == 2, swap mid and high, dont't decrease mid, as it  
# might 0 there.

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if not nums or len(nums) == 0:
            return 
        low = 0; mid = 0; high = len(nums) - 1
        while mid <= high:
            if nums[mid] == 0:
                self.swap(low, mid, nums)
                low += 1
                mid += 1
            elif nums[mid] == 1:
                mid += 1
            else:
                self.swap(mid, high, nums)
                high -= 1
        
    def swap(self, i, j, nums):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp