# time complexity is o(n), where n is the size of the input
# space complexity is o(1).
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low = 0
        mid = 0
        high = len(nums) - 1
        while(mid <= high):
            if(nums[mid] == 1):
                mid += 1
            elif(nums[mid] == 0):
                nums[low], nums[mid] = nums[mid], nums[low]
                low += 1
                mid += 1
            elif(nums[mid] == 2):
                nums[mid], nums[high] = nums[high], nums[mid]
                high -= 1
        return nums
       
            
                
        
        
        
