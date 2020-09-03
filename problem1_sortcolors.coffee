#https://leetcode.com/problems/sort-colors/
#// Time Complexity : O(n)
#// Space Complexity : O(1) we are swapping in place
#// Did this code successfully run on Leetcode : yes
#// Any problem you faced while coding this :
#
# intuition
#
#// Your code here along with comments explaining your approach
#
# keep 3 pointers, left, right and current
# left and curr start at element 0, right starts at nums.length-1
#
# loop through while curr <= right
#   if curr is 0
#     swap curr with left
#     increment both left and curr
#   else if curr is 1
#     increment curr, we are just looking for 0s to swap with left or 2's to swap with right
#   else curr is 2
#     swap curr with right
#     decrement right

swap = (nums, i, j) ->
  temp = nums[i]
  nums[i] = nums[j]
  nums[j] = temp

sortColors = (nums) ->
  return [] if nums is null or nums.length is 0

  left = 0
  right = nums.length-1
  curr = 0

  while curr <= right
    if nums[curr] is 0
      swap(nums, curr, left)
      curr += 1
      left += 1
    else if nums[curr] is 1
      curr += 1
    else # it is 2
      swap(nums, curr, right)
      right -= 1
