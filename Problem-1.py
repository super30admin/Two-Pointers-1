'''
    Time Complexity: O(n)
    Space Complexity: O(1)
'''
class Solution:
    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp

    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        low, high = 0, n-1
        mid = low

        while mid <= high:
            if nums[mid] == 2:
                self.swap(nums, mid, high)
                high -= 1
            elif nums[mid] == 0:
                self.swap(nums, mid, low)
                low += 1
                mid += 1
            else:
                mid += 1
        