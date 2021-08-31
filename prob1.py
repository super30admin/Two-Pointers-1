# Time Complexity : O(NlogN) for quick sort
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : I was not able to figure out how to do it in O(N) time

class Solution:
    
    def partition(self, nums: List[int], lo, hi) -> int:
        
        l = lo - 1
        pivot = nums[hi]
        for i in range(lo, hi):
            if pivot >= nums[i]:
                l += 1
                nums[i], nums[l] = nums[l], nums[i]
        nums[l+1], nums[hi] = nums[hi], nums[l+1]
        return (l + 1)
    
    def quickSort(self, nums: List[int], lo, hi) -> List[int]:
        
        if lo < hi:
            partition = self.partition(nums, lo, hi)
            self.quickSort(nums, lo, partition - 1)
            self.quickSort(nums, partition + 1, hi)
    
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        self.quickSort(nums, 0, len(nums) - 1)