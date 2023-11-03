#LC : yes, 75
#TC:  O(n)
#SC: O(1)
#problems NA

#low collects 0, mid collects 1s and high collects 2
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l = mid = 0
        h = len(nums) - 1

        while mid <= h:
            if nums[mid] == 0:
                nums[l], nums[mid] = nums[mid], nums[l]
                l += 1
                mid += 1
            elif nums[mid] == 2:
                nums[mid], nums[h] = nums[h], nums[mid]
                h -= 1
            else:
                mid += 1