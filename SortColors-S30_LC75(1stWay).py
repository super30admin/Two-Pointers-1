# TC = O(n), SC = O(1)
class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        map = {0: 0, 1: 0, 2: 0}  # map to keep count

        for i in range(len(nums)):
            if nums[i] == 0:
                map[0] += 1
            elif nums[i] == 1:
                map[1] += 1
            else:
                map[2] += 1

        for j in range(len(nums)):
            if map[0] > 0:
                nums[j] = 0
                map[0] -= 1
            elif map[1] > 0:
                nums[j] = 1
                map[1] -= 1
            else:
                nums[j] = 2
                map[2] -= 1

        return nums