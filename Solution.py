'''
// Time Complexity :
# Problem 1 - One pass O(n)
# Problem 2 - Nested loop (TIME LIMIT EXCEEDED!) O(n^3)
            - Two pointers O(2nlogn) ~ O(nlogn)
# Problem 3 - Nested for loop (TIME LIMIT EXCEEDED!) O(n^2) 
            - Two Pointers O(n)
// Space Complexity :
# Problem 1 - O(1) as we are changing the source array
# Problem 2 - O(n) to store the result array
# Problem 3 - O(1) as we store the max area
// Did this code successfully run on Leetcode :
# Yes the code ran successfully.

// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
'''
## Problem 1 - Sort Colors

# Initialize 3 pointers with left at the starting position and right at end of the array
# Initialize mid as 0 and iterate till mid crosses right.
# When mid element is '2' we swap it with the right element, else if the mid element is '0' then we 
# swap it with the left element
# Else the mid element is at correct location and we increment mid
# Return the sorted array

class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        if len(nums) == 0 or nums is None:
            return 0
        n = len(nums)
        l = 0; r = n - 1
        mid = 0
        while (mid <= r):
            if nums[mid] == 2:
                self.swap(nums, mid, r)
                r -= 1
            elif nums[mid] == 0:
                self.swap(nums, l, mid)
                l += 1
                mid += 1
            else:
                mid += 1
    
    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp


## Problem 2 - 3 Sum

# Brute force -TIME LIMIT EXCEEDED
# Initializa a result and temporary array.
# Iterate 3 times starting with first element in the first loop, second element in the second loop and
# from the third element in the third loop
# Sum all the three elements to see if the target is '0'
# Append the elements in the temp array and sort it to make sure there are no duplicates
# Append the temp array to the result and return.

class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        n = len(nums)
        result = []
        temp = []
        for i in range(n):
            for j in range(i+1, n):
                for k in range(j+1, n):
                    if nums[i] + nums[j] + nums[k] == 0:
                        temp = [nums[i], nums[j], nums[k]]
                        temp.sort()
                        if temp not in result:
                            result.append(temp)
        return result

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

class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        result = []
        if len(nums) < 3 or nums == None:
            return result
        n = len(nums)
        nums.sort()
        for i in range(n-2):
            if nums[i] > 0: break ## target is '0'
            ## outside duplicacy
            if i > 0 and nums[i] == nums[i-1]: continue
            l = i+1; r = n-1
            while l < r:
                curr = nums[i] + nums[l] + nums[r]
                if curr == 0:
                    result.append([nums[i], nums[l], nums[r]])
                    l += 1
                    r -= 1
                    while l < r and nums[l] == nums[l-1]:
                        l += 1
                    while l < r and nums[r] == nums[r+1]:

                        r -= 1
                elif curr > 0:
                    r -= 1
                else:
                    l += 1
        return result

## Problem 3 - Container with most water

# Solution 1 - Nested for loop (TIME LIMIT EXCEEDED!)
# Initialize a max area variable and if the heights array is less than 2 we return '0'
# Iterate over the heights array and calculate area based on height difference times the width of the
# array
# Compare the max area with the previous calculated area
# Return the maximum area

class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        if len(height) < 2 or height == None:
            return 0
        max_area = 0
        n = len(height)
        for i in range(n-1):
            for j in range(i, n):
                currArea = (j-i)*min(height[i], height[j])
                max_area = max(max_area, currArea)
        return max_area

# Solution 2 - Two Pointers
# Initialize a left pointer at '0' and the right pointer at the last element of the array
# Iterate over the array until the left pointer is less than right pointer and calculate the area as
# product of minimum height with width difference.
# Compare the calculated area with the max area 
# If left height is less than right height, increment the left pointer else decrement the right pointer
# Return the maximum area.

class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        if len(height) < 2 or height == None:
            return 0
        left = 0; right = len(height)-1
        n = len(height)
        max_area = 0
        while left < right:
            currArea = min(height[left], height[right])*(right - left)
            max_area = max(max_area, currArea)
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return max_area