"""
https://leetcode.com/problems/sort-colors/ - modify in place
no built-in sort to be used
The approach used is similar to 2 pointer but 3 pointers are maintained - since 3 colors
TC - O(n)
SC - O(1) - since sorted in place
"""

n = [2, 0, 2, 1, 1, 0]


def sortColors(nums):
    hiptr = len(nums) - 1
    mptr = 0
    midptr = 0

    def swap(i, j, nums):
        nums[i], nums[j] = nums[j], nums[i]

    while midptr <= hiptr:

        if nums[midptr] == 2:
            swap(midptr, hiptr, nums)
            hiptr -= 1
        elif nums[midptr] == 0:
            swap(midptr, mptr, nums)
            midptr += 1
            mptr += 1
        else:
            midptr += 1


print(sortColors(n))
