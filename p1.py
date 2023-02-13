#Tc = O(n)
#Sc = O(1)
#successfully submitted on Leetcode: yes

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        l = 0
        m = 0
        h = len(nums) - 1

        while m <= h:
            if nums[m] == 2:
                #swap
                nums[m], nums[h] = nums[h], nums[m]
                h -= 1
            elif nums[m] == 0:
                nums[m], nums[l] = nums[l], nums[m]
                l += 1
                m += 1
            elif nums[m] == 1:
                m += 1