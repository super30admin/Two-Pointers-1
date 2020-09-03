#// https://leetcode.com/problems/container-with-most-water/
#// Time Complexity : O(n)
#// Space Complexity : O(1) keeping track of max area, left, and right indices
#// Did this code successfully run on Leetcode : yes
#// Any problem you faced while coding this : intuition
#
#
#// Your code here along with comments explaining your approach
#
# start left pointer at index 0, right pointer at height.length-1
# calculate area, this will be our current max
# while left < right
#   choose left or right to try another area
#   (because we want max area, increment left or decrement right by changing the lesser of left or right, keeping the larger)
#   update max area if necessary
#
# return area

maxArea = (height) ->
  return 0 if height is null or height.length is 0

  left = 0
  right = height.length - 1
  area = null
  max = Number.MIN_SAFE_INTEGER

  while left < right
    if height[left] < height[right]
      area = height[left] * (right - left)
      left += 1
    else # right > left
      area = height[right] * (right - left)
      right -= 1

    max = Math.max(max, area)

  if max == Number.MIN_SAFE_INTEGER then 0 else max
