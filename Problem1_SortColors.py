# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes

# Solution:
"""
1. Consider 3 pointers - low, mid and high for the 3 colors denoted by 0, 1, 2.
2. Iterate the mid pointer through the array, if element is '0' swap it with the low pointer or if it is '2', swap with high pointer.
3. If it is '1', just move to the next element without any swap. The resultant array will be in the sorted order.
"""


def sortColors(self, nums: List[int]) -> None:
    if not nums or len(nums) == 0:
        return

    low = 0
    mid = 0
    high = len(nums) - 1

    while mid <= high:

        # If element is 0, swap it with the low pointer element.
        if nums[mid] == 0:
            nums[mid], nums[low] = nums[low], nums[mid]
            low += 1
            mid += 1

        # If element is 2, swap it with the high pointer element.
        elif nums[mid] == 2:
            nums[mid], nums[high] = nums[high], nums[mid]
            high -= 1

        # If element is 1, move to the next element.
        else:
            mid += 1