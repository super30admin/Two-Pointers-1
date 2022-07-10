'''
## Problem 15: 3Sum

## Author: Neha Doiphode
## Date:   07-10-2022

## Description
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

## Examples:
    Example 1:
        Input: nums = [-1,0,1,2,-1,-4]
        Output: [[-1,-1,2],[-1,0,1]]
        Explanation:
            nums[0] + nums[1] + nums[1] = (-1) + 0 + 1 = 0.
            nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
            nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.

            The distinct triplets are [-1,0,1] and [-1,-1,2].
            Notice that the order of the output and the order of the triplets does not matter.

    Example 2:
        Input: nums = [0,1,1]
        Output: []
        Explanation: The only possible triplet does not sum up to 0.

    Example 3:
        Input: nums = [0,0,0]
        Output: [[0,0,0]]
        Explanation: The only possible triplet sums up to 0.

## Constraints:
    3 <= nums.length <= 3000
    -105 <= nums[i] <= 105

## Time complexity: O(n^2), since we use two pointers outer loop is traverses thru the whole array.
                            Inner loops are traversed with two pointers and only one of them gets executed at a time.
                            we never re-visit elements traversed by the outer loop again and again.

## Space complexity: O(1), No auxiliary array is used.
'''

from typing import List

def get_input():
    print("Enter the input array: ", end = "")
    inp_list = input()
    inp_list = [int(value) for value in inp_list.split()]
    return inp_list


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        nums = sorted(nums)

        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            left = i + 1
            right = len(nums) - 1

            while left < right:
                total = nums[i] + nums[left] + nums[right]
                if total < 0:
                    left += 1

                elif total > 0:
                    right -= 1

                else:
                    result.append([nums[i], nums[left], nums[right]])
                    left += 1
                    right -= 1
                    while (left < right) and nums[left] == nums[left -1]:
                        left += 1

                    while (left < right) and nums[right] == nums[right + 1]:
                        right -= 1

        return result

# Driver code
solution = Solution()
inp_array = get_input()
print(f"Input array: {inp_array}")
print(f"Output list with triplets that sum upto 0: {solution.threeSum(inp_array)}")
