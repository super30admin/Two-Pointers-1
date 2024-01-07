
"""
11. Container With Most Water
Medium
"""
from leetcode_runner import LeetCode, TestCase, Args
from typing import *

PROBLEM = """
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.
 
Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

Example 2:

Input: height = [1,1]
Output: 1

 
Constraints:

n == height.length
2 <= n <= 105
0 <= height[i] <= 104


"""

class Solution:
    
    """
    Accepted
    Time Complexity :  O(n)
    Space Complexity : O(1)
    Did this code successfully run on Leetcode : Yes 
    Runtime 37.77%
    Memory  82.31%
    
    Two pointer approach - O(n)
    start with max width, and then move the pointer which has the smaller height (equal case, move either)
    this will ensure that we are always moving towards a higher height
    compute area and update the max as you go
    
    """
    def maxArea(self, height: List[int]) -> int:
        def area(i, j, height): # area function
            diff = j - i
            m = min(height[i], height[j])
            return diff * m
        left, right= 0, len(height)-1
        theMax = -1
        while left < right:
            theMax = max(theMax, area(left, right, height)) # update max
            if height[left] < height[right]: # move the left pointer if left height is smaller
                left = left + 1
            else: # equal case Or right height is smaller, move right pointer
                right = right -1
        return theMax
    
    
    """
    Not Accepted
    Bruteforce -O(n^2)
    TLE
    """
    def maxArea2(self, height: List[int]) -> int:
        def water(i, j, height):
            diff = j - i
            m = min(height[i], height[j])
            return diff * m
        theMax = -1
        for i in range(len(height)):
            for j in range(i+1, len(height)):
                theMax = max(theMax, water(i,j,height))
        return theMax

LeetCode(PROBLEM, Solution).check()
