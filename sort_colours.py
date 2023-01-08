# Time Complexity :
# O(N*M)  - Size of the Matrix

# Space Complexity :
# O(1) - There is no auxillary space being allocated

# Did this code successfully run on Leetcode :
#Yes

#Count the number of occuraces of each element and update the array based on these counts

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        count_1 = 0
        count_2 = 0
        count_0 = 0

        for elem in nums:
            if elem == 0:
                count_0 += 1
            if elem == 1:
                count_1 += 1
            if elem == 2:
                count_2 += 1

        for i in range(len(nums)):
            if i < count_0 :
                nums[i] = 0
            if i >= count_0 and i < count_1  + count_0:
                nums[i] = 1
            if i >= count_0 + count_1 :
                nums[i] = 2
