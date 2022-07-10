'''
## Problem 75: Sort colors

## Author: Neha Doiphode
## Date:   07-08-2022

## Description:
    Given an array nums with n objects colored red, white, or blue,
    sort them in-place so that objects of the same color are adjacent,
    with the colors in the order red, white, and blue.

    We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
    You must solve this problem without using the library's sort function.

## Examples:
    Example 1:
        Input: nums = [2,0,2,1,1,0]
        Output: [0,0,1,1,2,2]

    Example 2:
        Input: nums = [2,0,1]
        Output: [0,1,2]

## Constraints:
    n == nums.length
    1 <= n <= 300
    nums[i] is either 0, 1, or 2.

Time complexity: O(n), we traverse the array once.

Space complexity: O(1), we sort in-place.

'''
from typing import List

def get_input():
    print("Enter the array with 0s, 1s and 2s(with spaces): ", end = "")
    inp_list = input()
    inp_list = [int(value) for value in inp_list.split()]
    return inp_list


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low = 0
        mid = 0
        high = len(nums) - 1

        while mid <= high:
            if nums[mid] == 0:
                nums[mid], nums[low] = nums[low], nums[mid]
                low += 1
                mid += 1

            elif nums[mid] == 1:
                mid += 1
            else:
                nums[mid], nums[high] = nums[high], nums[mid]
                high -= 1

# Driver code
solution = Solution()
inp_array = get_input()
print(f"Input colors array: {inp_array}")
solution.sortColors(inp_array)
print(f"In-place sorted colors: {inp_array}")
