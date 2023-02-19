# Two pointers
# Submitted successfully
# TC = O(n), SC = O(1)
class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        L=0    # Low pointer for 0
        M=0    # Mid pointer for 1
        H=len(nums)-1    # High pointer for 2

        while (M<=H):
            if (nums[M]==2):
                nums[M], nums[H] = nums[H], nums[M]
                H-=1
                # M+=1 should not be kept because there might be a 2 in the beginning which might get skipped
            elif (nums[M]==0):
                nums[M], nums[L] = nums[L], nums[M]
                L+=1
                M+=1    # should be kept because 0 is the smallest value there is and Mid has to be more than Low
            else:
                M+=1

        return nums