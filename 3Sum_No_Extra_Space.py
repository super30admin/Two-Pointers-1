# Created by Aashish Adhikari at 8:23 AM 1/9/2021

'''
Time Complexity:
O(n^2)

Space Complexity:
O(1)
'''

class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """

        result = []
        nums.sort()

        for idx in range(0, len(nums)):

            # Avoid duplicates
            if idx > 0 and nums[idx] == nums[idx-1]:
                continue

            low = idx+1
            high = len(nums)-1

            while low < high:

                sum = nums[idx] + nums[low] + nums[high]

                if sum > 0:
                    high -= 1


                elif sum < 0:
                    low += 1

                else:
                    result.append([nums[idx], nums[low], nums[high]])
                    low += 1
                    high -= 1
                    # Avoid duplicates
                    while low < high and nums[low] == nums[low-1]:
                        low += 1
                    while low < high and nums[high] == nums[high+1]:
                        high -= 1
        return result





