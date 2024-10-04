from typing import List
"""
Approach1: sort the array. TC: O(n log(n))
Approach2: Define a new array. While traversing the given array, add all 0 to new then add all 1 and then all 2.
Approach3: Store the frequency of each color into hmap and traverse the hmap from 0 to 2 and add number based on
the frequency. TC: O(n) (store) + O(n) (update the array), or we can keep variable 3 to keep their count.
Approach4: take two pointers (slow and fast), one represents the correct position of a color and second to find what
color should come at that position. Once the colr is found, swap it. Note that fast should start from slow to make
sure all the elements are covered in the array. TC: O(n^2)

Approach5: keep 3 pointers low, mid and high. low keep track of idx where 0 should appear, high keep track of
position where 2 should appear and mid check where should the number at mid index go. If it is 2 swap with high 
and if 0 swap with low.
"""


class Solution:
    def sortColors_approach5(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        lo, hi, mid = 0, len(nums) - 1, 0
        # the idea is that the low stays behind mid i.e, low track 0, mid track 1
        # that is why the condition is mid <= hi.
        while mid <= hi:
            if nums[mid] == 2:
                nums[mid], nums[hi] = nums[hi], nums[mid]
                hi -= 1
            elif nums[mid] == 0:
                nums[mid], nums[lo] = nums[lo], nums[mid]
                lo += 1
                mid += 1
            else:
                mid += 1

    def sortColors_approach4(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        slow = 0
        for num in range(3):
            fast = slow
            while fast < len(nums):
                if nums[fast] == num:
                    nums[slow], nums[fast] = nums[fast], nums[slow]
                    slow += 1
                fast += 1
