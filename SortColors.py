# TC = O(n)
# SC = O(1)


class Solution:
    def swap(self, a, b):
        temp = a
        a = b
        b = temp

        return a, b

    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l = 0
        r = len(nums) - 1
        i = 0
        while i <= r and i < len(nums):
            if l < r and nums[i] == 0:

                nums[i], nums[l] = self.swap(nums[i], nums[l])
                l += 1
                i += 1

            elif l < r and nums[i] == 2:

                nums[i], nums[r] = self.swap(nums[i], nums[r])

                r -= 1
            else:

                i += 1
