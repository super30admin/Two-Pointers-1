'''

## Problem 11: Container with most water

## Author: Neha Doiphode
## Date:   07-10-2022

## Description:
    You are given an integer array height of length n.
    There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
    Find two lines that together with the x-axis form a container, such that the container contains the most water.
    Return the maximum amount of water a container can store.
    Notice that you may not slant the container.

## Examples:
    Example 1:
        Input: height = [1,8,6,2,5,4,8,3,7]
        Output: 49
        Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

    Example 2:
        Input: height = [1,1]
        Output: 1

## Constraints:
    n == height.length
    2 <= n <= 105
    0 <= height[i] <= 104

## Time complexity: O(n), where n is the lenght of input array of heights. Array is traversed once.

## Space complexity: O(1), no auxiliary space is used.
'''

def get_input():
    print("Enter the array of heights(with spaces): ", end = "")
    inp_list = input()
    inp_list = [int(value) for value in inp_list.split()]
    return inp_list


class Solution:
    def maxArea(self, height: List[int]) -> int:
        max_area = -float("inf")
        left = 0
        right = len(height) - 1

        while left <= right:
            if height[left] < height[right]:
                temp = height[left] * (right - left)
                if  temp > max_area:
                    max_area = temp
                left += 1
            elif height[left] > height[right]:
                temp = height[right] * (right - left)
                right -= 1
            else:
                temp = height[right] * (right - left)
                left += 1
                right -= 1

            if temp > max_area:
                    max_area = temp
        return max_area

# Driver code
solution = Solution()
inp_array = get_input()
print(f"Input height array: {inp_array}")
print(f"Max area: {solution.maxArea(inp_array)}")
