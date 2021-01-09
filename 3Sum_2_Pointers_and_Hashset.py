# Created by Aashish Adhikari at 8:19 AM 1/9/2021

'''
Time Complexity:
O(n^2)
Space Complexity:
In the worst case, there will be n/3 unique triplets. So we store all of them in the hs. Hence, O(n)
'''

class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """

        # in place sort
        nums = sorted(nums)

        hs = set()

        for idx in range(0,len(nums)):

            summ = nums[idx]
            low = idx+1
            high = len(nums)-1

            while low < high:

                if summ  +  nums[low] + nums[high] == 0:

                    triplet_list = [summ, nums[low], nums[high]]
                    sorted_ = sorted(triplet_list)
                    triplet_tuple = (sorted_[0], sorted_[1], sorted_[2])

                    if triplet_tuple not in hs:
                        hs.add(triplet_tuple)

                    low += 1
                    high -= 1
                elif summ + nums[low] + nums[high] > 0:

                    high -= 1
                else:
                    low += 1



        return [item for item in hs]