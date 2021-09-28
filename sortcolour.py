class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # TC O(n)
        # SC O(1)
        if nums is None or len(nums) == 0:
            return
        high = len(nums) -1
        low = 0
        mid = 0
        while mid <= high:
                
            if nums[mid] == 2:
                nums[mid],nums[high] = nums[high] ,nums[mid]
                high -= 1
            elif nums[mid] == 1:
                mid += 1
            else:
                nums[mid],nums[low] = nums[low] ,nums[mid]
                low +=1
                mid += 1
                
