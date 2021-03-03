class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Solved using 3 pointers
        
        low starts at 0, mid at 0
        high starts at len(nums) - 1
        
        low is used to put 0's at front, high is used to put 2's at end
        """
        low = 0
        mid = 0
        high = len(nums) - 1
        
        while mid <= high:
            if nums[mid] == 2:
                nums[mid], nums[high] = nums[high], nums[mid]
                high -= 1
            elif nums[mid] == 0:
                nums[mid], nums[low] = nums[low], nums[mid]
                low += 1
                mid += 1
            elif nums[mid] == 1:
                mid += 1
        return nums