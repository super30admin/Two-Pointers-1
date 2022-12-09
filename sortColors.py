class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        if nums is None or n <= 0:
            return
        low, mid = 0, 0
        high = n - 1

        while (mid <= high):
            if nums[mid] == 0:
                self.swap(nums, mid, low)
                mid += 1
                low += 1

            elif nums[mid] == 1:
                mid += 1
            
            else:
                self.swap(nums, mid, high)
                high -= 1
        return

    def swap(self, nums:List[int], num1: int, num2: int) -> None:
        temp = nums[num1]
        nums[num1] = nums[num2]
        nums[num2] = temp
