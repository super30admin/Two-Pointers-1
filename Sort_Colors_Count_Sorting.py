# Created by Aashish Adhikari at 7:48 PM 1/8/2021

'''
Time Complexity:
O(n) + O(n)

Space Complexity:
O(1)
'''


class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """

        c1, c2, c3 = 0, 0, 0

        for idx in range(len(nums)):

            if nums[idx] == 0:
                c1 += 1
            elif nums[idx] == 1:
                c2 += 1
            else:
                c3 += 1


        for idx in range(0, len(nums)):

            if c1 != 0:
                nums[idx] = 0
                c1 -= 1
            else:
                if c2 != 0:
                    nums[idx] = 1
                    c2 -= 1
                else:
                    nums[idx] = 2


