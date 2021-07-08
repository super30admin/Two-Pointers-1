class Solution:
    def sortColors(self, nums):

        if nums == None or len(nums) == 0:
            return 0

        left = 0
        right = len(nums) - 1
        mid = 0

        while mid <= right:
            if nums[mid] == 0:
                nums[left], nums[mid] = nums[mid], nums[left]
                mid = mid + 1
                left = left + 1
            elif nums[mid] == 2:
                nums[mid], nums[right] = nums[right], nums[mid]
                right = right - 1
            else:
                mid = mid + 1
        return nums

sol=Solution()
nums=[2,1,0,0,1,2,1,1,0,1,2,0,1,2]
print(sol.sortColors(nums))
