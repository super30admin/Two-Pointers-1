class Solution:
    def __init__(self):
        self.nums = []

    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        self.nums = nums
        self.sort()

    def sort(self):
        low = mid = 0
        high = len(self.nums) - 1

        while mid <= high:
            if self.nums[mid] == 1:
                mid += 1
            elif self.nums[mid] == 0:
                self.swap(low, mid)
                low += 1
                mid += 1
            else:
                self.swap(mid, high)
                high -= 1

    def swap(self, i, j):
        self.nums[i], self.nums[j] = self.nums[j], self.nums[i]
