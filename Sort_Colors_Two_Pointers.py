# Created by Aashish Adhikari at 7:49 PM 1/8/2021

'''
Time Complexity:
O(n)
Space Complexity:
O(1)
'''

class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """


        p1 = 0
        p2 = len(nums)-1
        idx = 0

        while idx <= p2:

            if nums[idx] == 0:

                nums[p1], nums[idx] = nums[idx], nums[p1]
                p1 += 1
                idx += 1
            elif nums[idx] == 2:
                nums[p2], nums[idx] = nums[idx], nums[p2]
                p2 -= 1
                #idx += 1   <-- Do not increment here.
            else:
                idx += 1

