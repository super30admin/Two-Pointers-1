#// https://leetcode.com/problems/3sum/
#// Time Complexity : O(n^2) within a loop we are looping
#// Space Complexity : O(1) keeping 3 indexes left, right, currentSum
#// Did this code successfully run on Leetcode : yes
#// Any problem you faced while coding this :
#
#    I had to google the default .sort() function in javascript
#
#// Your code here along with comments explaining your approach
#
#
# keep track of  3 indices: current, left, and right
# sort nums so you can make size inferences
# for each element, index up to nums.length - 2 // you leave 2 elements for left and right
#   start left at 1 + current index
#   start right at nums.length-1
#   calculate current sum of current, left, and right
#   if sum == 0 store the result, update left += 1 and right -= 1
#   else if sum < 0, you need to increase value so just update left += 1
#   else sum is > 0, you need to decrease value so update right -= 1
#
# (there are some optional optimizations for skipping characters you've already visited)

threeSum = (nums) ->
  return [] if nums is null or nums.length == 0

  output = []

  nums.sort (a, b) -> a - b # O(nlogn)

  for i in [0...nums.length-2]
    continue if i isnt 0 and nums[i-1] is nums[i] # skip repeated elements unless you are at the first element
    left = i + 1
    right = nums.length-1

    while left < right
      currentSum = nums[i] + nums[left] + nums[right]
      if currentSum is 0
        output.push([nums[i], nums[left], nums[right]])
        left += 1
        right -= 1
        while left < right and nums[left] == nums[left-1] # don't cross skip duplicates
          left += 1
        while left < right and nums[right] == nums[right+1] # don't cross skip duplicates
          right -= 1

      else if currentSum < 0
        left += 1
        while left < right and nums[left] == nums[left-1] # don't cross skip duplicates
          left += 1
      else # currentSum > 0
        right -= 1
        while left < right and nums[right] == nums[right+1] # don't cross skip duplicates
          right -= 1

  output

threeSum([-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6])
#threeSum([-1,0,1,2,-1,-4])
