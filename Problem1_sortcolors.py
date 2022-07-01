'''
We will have 3 pointers middle, low and high. Our approach would be to handle all the cases using only the middle pointer and manipulating the low and high pointers. So we are basically collecting 2s using high, 1s using middle, and 0s using low. When mid crosses high all the elements are collected. So in this approach mid kind of acts as a low pointer.
'''

'''
time complexity : O(n)
space complexity : O(1)
'''


class Solution:

    # the function to do swapping
    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp

    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        # null condition
        if (nums == None and len(nums) == 0):
            return

        low = 0
        mid = 0
        high = len(nums) - 1

        # we terminate when mid crosses high
        while (mid <= high):
            if (nums[mid] == 0):
                self.swap(nums, mid, low)

                # because we found the low and now we just increament middle aswell to iterate
                low += 1
                mid += 1

            # second condition for the check
            elif (nums[mid] == 2):
                self.swap(nums, mid, high)

                # found a 2 so at the end of the array, now we come back
                high -= 1

            else:

                # found 1 so middle collects it and moves on
                mid += 1