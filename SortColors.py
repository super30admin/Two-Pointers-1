"""
Rasika Sasturkar
Time Complexity: O(n)
Space Complexity: O(1)
"""


def sortColors(nums):
    """
    Do not return anything, modify nums in-place instead.
    Use of three pointers to keep track of positions of 3 colors.
    """

    # null case
    if nums is None:
        return

    low = 0  # keeps track of red color
    mid = 0  # keeps track of white color
    high = len(nums) - 1  # keeps track of blue color

    while mid <= high:
        if nums[mid] == 2:
            swap(nums, mid, high)
            high -= 1
        elif nums[mid] == 0:
            swap(nums, mid, low)
            mid += 1
            low += 1
        else:
            mid += 1
    return nums


def swap(nums, i, j):
    """
    swaps 2 numbers
    """
    temp = nums[i]
    nums[i] = nums[j]
    nums[j] = temp


def main():
    """
    Main function - an example from LeetCode problem to show the working.
    This code ran successfully on LeetCode and passed all test cases.
    """
    nums1 = [2, 0, 2, 1, 1, 0]
    print(sortColors(nums1))  # returns [0, 0, 1, 1, 2, 2]
    nums2 = [2, 0, 1]
    print(sortColors(nums2))  # returns [0, 1, 2]


if __name__ == "__main__":
    main()
