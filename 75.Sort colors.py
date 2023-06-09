#Time Complexity : O(N)
#Space compleity : O(1)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l = 0
        mid = 0
        r = len(nums) - 1

        while mid <= r:
            if nums[mid] == 2:
                self.swap(nums, mid, r)
                r -= 1
            elif nums[mid] == 0:
                self.swap(nums, mid, l)
                mid += 1
                l += 1
            else:
                mid += 1

    def swap(self, nums: List[int], i: int, j: int) -> None:
        if i == j:
            return
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp