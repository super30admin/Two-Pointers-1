# sc O(1)
# tc O(N)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        low = 0
        mid = 0
    
        high = len(nums) - 1
        
        while(mid <= high):
            if nums[mid] == 2:
                nums[mid], nums[high] = nums[high], nums[mid]
                high -=1
            elif nums[mid] == 0:
                nums[mid], nums[low] = nums[low], nums[mid]
                mid += 1
                low += 1
            else:
                mid += 1
                