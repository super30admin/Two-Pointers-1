# Time Complexity = O(n) Space Complexity = O(1)

class Solution:
    def sortColors(self, nums: list[int]) -> None:

        n = len(nums)
        for i in range(n-1):
            low = 0
            mid = 0
            high = n - 1
            while mid <= high:
                if nums[mid] == 2:
                    # swap mid and high and move high
                    self.swap(nums, mid, high)
                    high -= 1
                elif nums[mid] == 0:
                    # swap mid and low and move low and mid
                    self.swap(nums, mid, low)
                    low += 1
                    mid += 1
                else:
                    # mid is collecting 1's so do nothing and move mid
                    mid += 1

    def swap(self, nums: list[int], i: int, j: int):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
