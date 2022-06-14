class Solution:
    def sortColors(self, nums):
        """
        Do not return anything, modify nums in-place instead.
        """
        # if nums is None or len(nums) == 0:
        #     return

        low, mid, high = 0, 0, len(nums) - 1

        while mid <= high:
            if nums[mid] == 2:
                self.swap(nums, mid, high)
                high -= 1
            elif nums[mid] == 0:
                self.swap(nums, mid, low)
                mid += 1
                low += 1
            else:
                mid += 1
        return print(nums)

    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp


if __name__ == "__main__":
    obj = Solution()
    obj.sortColors([2, 2, 2, 1, 1, 1, 0, 0])

# TC = O(n).
# Space complexity : O(1). Constant. No extra space used
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : Yes, Was receiving incorrect answer after debugging ,
# I found I wrote mid == 2 and mid == 0 instead of nums[mid] == 2 and nums[mid] == 0 respectively.
