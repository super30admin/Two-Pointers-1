#time O(n)
#space O(1)

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        k=collections.Counter(nums)
        red=k[0]
        white=k[1]
        blue=k[2]
        for i in range(len(nums)):
            if i<red:
                nums[i]=0
            elif i<red+white:
                nums[i]=1 
            else:
                nums[i]=2       