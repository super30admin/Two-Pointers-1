"""
## Problem3 (https://leetcode.com/problems/container-with-most-water/)
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.



The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

Example:

Input: [1,8,6,2,5,4,8,3,7]
Output: 49

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : No

"""
# we take the height from left or right side, which is smaller and calculate the area by multiplying the lower height with width
# which is right -left index  and i end we take the maximum area


def Container(nums):
    left=0
    right=len(nums)-1
    max_area=0
    while left < right:
        if nums[left]< nums[right]:
            area= nums[left]*(right-left)
            left +=1
        else:
            area = nums[right] * (right - left)
            right -= 1
        max_area=max(max_area,area)
    return max_area

print(Container([1,8,6,2,5,4,8,3,7]))



