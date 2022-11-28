class Solution:
    """
    Time complexity - O(n). n - size of nums
    Space complexity - O(1)
    """
    def sortColors(self, nums: list[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        r = 0 # red pointer
        i = 0 # white pointer
        b = len(nums) - 1 # blue pointer
        while i <= b:
            if nums[i] == 2:
                nums[i] = nums[b]
                nums[b] = 2
                b -= 1
            elif nums[i] == 0:
                nums[i] = nums[r]
                nums[r] = 0
                r += 1
                i += 1
            else:
                i += 1
        
        