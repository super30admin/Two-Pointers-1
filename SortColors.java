//Time complexity: O(n)
//Space complexity: O(1)
//Leetcode: Yes

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        n = len(nums)

        if n == 0 or n == 1:
            return nums
        
        counts = [0]*3

        for i in nums:
            counts[i] +=1
        
        r,w,b = counts

        nums[:r] = [0] * r
        nums[r:r+w] = [1] * w
        nums[r+w:r+w+b] = [2] * b

        return nums