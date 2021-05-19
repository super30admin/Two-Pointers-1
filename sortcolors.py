class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        TC: O(N)
        SC: O(1)
        
        Approach: Three pointer approach
        left pointer for 0's
        right pointer for 2's
        mid pointer for 1's
        
        if the element at mid pointer is 1 increment mid
        if the element at mid pointer is 2 swap it with rightt pointer and reduce the right
        if the element at mid pointer is 0 swap it with left pointer and increment the left
        do this until mid <=  right
        
        
        """
        low = 0
        mid = 0
        high = len(nums) - 1
        while  mid <= high:
            if nums[mid] == 1 : mid += 1
            elif nums[mid] == 2:
                nums[mid],nums[high] = nums[high],nums[mid]
                high -= 1
            else:
                nums[mid],nums[low] = nums[low],nums[mid]
                low += 1
                mid += 1
                

            
        
        
        