# Time complexity = O(n)
# Space complexity = O(1)
#use low, mid & high pointers each tracking 0,1,2 numbers, just compare and move respective pointers, *move mid++ with low to ensure mid is always >= low
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low = mid = 0
        high = len(nums) - 1
        while (mid <= high):
            if nums[mid] == 2:
               nums[mid],nums[high] = nums[high], nums[mid]
               high -= 1
            elif nums[mid] == 0:
                nums[mid],nums[low] = nums[low], nums[mid]
                low += 1
                mid += 1
            else:
                mid += 1
        return nums
        
