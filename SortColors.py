class Solution:
    def sortColors(self, nums):
        """
        Do not return anything, modify nums in-place instead.
        """
        if len(nums) == 0:
            return

        left, right = 0, len(nums)-1
        cur = 0

        while cur <= right:
            if nums[cur] == 0:
                nums[left], nums[cur] = nums[cur], nums[left]
                cur += 1
                left += 1
            elif nums[cur] == 1:
                cur += 1
            else:
                nums[cur], nums[right] = nums[right], nums[cur]
                right -= 1
        return nums


solution = Solution()
print(solution.sortColors([2, 0, 2, 1, 1, 2, 1, 1, 0, 0, 1, 2]))
