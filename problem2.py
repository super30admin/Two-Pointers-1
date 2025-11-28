"""
We use the two pointers approach and then we fix on number and squeeze the remaining array to check if we get a total sum of 0
skipping same numbers is the optimization in this approach
TC is o(n^2) because for each element n, we use two pointers scan on all other elements, sorting also takes o(nlog) so total TC is o(n^2) and SC is o(1)
"""

class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        n = len(nums)
        res = []

        for i in range(n):
            if nums[i] > 0: #stop, the sum wont be 0 anyways hence break
                break
            elif i > 0 and nums[i] == nums[i-1]: #skip fixed number if they are same
                continue
            low, high = i + 1, n - 1
            while low < high:
                summ = nums[i] + nums[low] + nums[high] 
                if summ == 0:
                    res.append([nums[i], nums[low], nums[high]])
                    low, high = low + 1, high - 1
                    while low < high and nums[low] == nums[low - 1]: #skip same numbers
                        low += 1
                    while low < high and nums[high] == nums[high + 1]:
                        high -= 1
                elif summ > 0:
                    high -= 1
                else:
                    low += 1
        return res