# ran on leetcode succefully
# time complexity: o(n)
# no doubt

# explaination: we will need three pointers, low mid and high. the low pointer should always point to 0, mid pointer should point to 1's and  high pointer to 2.
# intially the low and the mid pointer will be point to the first index that is 0 index and the high pointer to 2. The mid pointer will be the one traversing the array

# when the mid pointer gets a zero, it will swap with the low pointer (cos low pointer should always point to zero). incremenet low and mid

# When the mid pointer finds 1, (its right), so mid pointer just increments

# when the mid pointer finds a two. it will swap with the high pointer because high pointer should point to 2. The high decrement.


# this is extra --- incase if the high pointer has 0 and it swaps and gets the value 2 and the mid gets 0, the mid will again check, since its pointing to zero, it will swap with......low


class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.

        """
        low = 0
        mid = 0
        high = len(nums) - 1
        for i in range(len(nums)):
            while (mid <= high):
                if nums[mid] == 0:
                    nums[low], nums[mid] = nums[mid], nums[low]
                    low += 1
                    mid += 1
                elif nums[mid] == 1:
                    mid += 1
                else:
                    nums[high], nums[mid] = nums[mid], nums[high]
                    high -= 1
