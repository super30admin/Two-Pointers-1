"""
TC: O(n) n -> len(nums)
SP:O(1) original array is modified
"""
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        counter = [0]*3
        for n in nums:
            counter[n]+=1
        i = 0
        for n in range(len(counter)):
            for _ in range(counter[n]):
                nums[i] = n
                i+=1
        