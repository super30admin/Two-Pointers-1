class Solution:
    def sortColors(self, nums: List[int]) -> None:

        if (len(nums) == 0):
            return
        l = 0
        mid = 0
        h = len(nums) - 1
        while (mid <= h):
            if (nums[mid] == 2):
                self.swap(nums, mid, h)
                h -= 1
            elif (nums[mid] == 0):
                self.swap(nums, mid, l)
                l += 1
                mid += 1
            else:
                mid += 1

    def swap(self, nums, i, j):
        if (i == j):
            return
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
