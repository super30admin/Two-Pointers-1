# Created by Aashish Adhikari at 7:42 AM 1/9/2021

'''
Time Complexity:
O(n^3)

Space Complexity:
In the worst case, there will be n/3 unique triplets. So we store all of them in the hs. Hence, O(n)
'''

class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """

        hs = set()

        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                for k in range(j+1, len(nums)):

                    if nums[i] + nums[j] + nums[k] == 0:

                        sortedd = sorted([nums[i], nums[j], nums[k]]) #    <-- use tuple to hash since list is not hashable
                        tuplee = (sortedd[0], sortedd[1], sortedd[2])

                        if  tuplee not in hs:

                            hs.add(tuplee)

        return [item for item in hs]

