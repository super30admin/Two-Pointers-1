# Two-Pointers-1

## Problem1 (https://leetcode.com/problems/sort-colors/)

# Initialize 3 pointers with left at the starting position and right at end of the array
# Initialize mid as 0 and iterate till mid crosses right.
# When mid element is '2' we swap it with the right element, else if the mid element is '0' then we 
# swap it with the left element
# Else the mid element is at correct location and we increment mid
# Return the sorted array

## Problem2 (https://leetcode.com/problems/3sum/)

# Two Pointers 
# Sort the array so that we can eliminate the elements that are greater than the target reducing the 
# search space array
# Initialize pointers with the first and last element of the array and iterate over the array till
# the second last element
# If the element is greater than target then we break and if the previous and current element are the 
# same then we continue, increment the left pointer and decrement the right pointer
# Take sum of all three elements to see if it is '0' store the array elements in result and increment
# the left pointer and decrement the right pointer.
# When the left pointer element is less than right pointer and the previous of left element is equal to
# left element increment the left pointer OR right element is equal to the next right element decrement 
# the right pointer
# Else when the current element is greater than '0' decrement the right pointer or increment the left 
# pointer. Return the final result array.

## Problem3 (https://leetcode.com/problems/container-with-most-water/)

# Two Pointers
# Initialize a left pointer at '0' and the right pointer at the last element of the array
# Iterate over the array until the left pointer is less than right pointer and calculate the area as
# product of minimum height with width difference.
# Compare the calculated area with the max area 
# If left height is less than right height, increment the left pointer else decrement the right pointer
# Return the maximum area.