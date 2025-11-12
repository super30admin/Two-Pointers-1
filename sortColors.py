class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l = 0 
        r = len(nums)-1
        
        curr = l 
        while curr <= r:
            if nums[curr] == 1: 
                curr += 1 
            elif nums[curr] == 0:
                nums[curr],nums[l] = nums[l],nums[curr]
                l += 1 
                curr += 1 
            else: 
                nums[curr],nums[r] = nums[r],nums[curr]
                r -= 1 

# While iterating through the array, if the current element is `0`, swap it with the left pointer; if it’s `2`, swap it with the right pointer; otherwise, just move forward until the entire array is processed.
# Time = O(n)
# Space = O(1)