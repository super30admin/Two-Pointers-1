# Time complexity : O(n)
# Space Complexity : O(1)
class Solution(object):
    def sortColors(self, nums):
        #         Initialize left, right and mid  pointer
        left = 0
        mid = 0
        right = len(nums) - 1
        #         till mid is less than or equal to right we will iterate over array
        while mid <= right:
            # if current mid is 2 then we need to move 2 to right side (correct place) and update right pointer
            if nums[mid] == 2:
                nums[mid], nums[right] = nums[right], nums[mid]
                right -= 1
            #            if current mid element is 1 which is at its correct place then just update mid element
            elif nums[mid] == 1:
                mid += 1
            # if mid element is 0 then we need to move that
            # to left(correct place) and update mid and left pointer
            elif nums[mid] == 0:
                nums[mid], nums[left] = nums[left], nums[mid]
                left += 1
                mid += 1

        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
