## Problem1 (https://leetcode.com/problems/sort-colors/)

# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Maintain 3 pointers low, mid and high. Iterate over the array and if the element is 0, swap it with the element
# at low pointer and increment low and mid. If the element is 2, swap it with the element at high pointer and decrement
# high. If the element is 1, increment mid.

class Solution(object):
    def sortColors(self, nums):
        low = 0
        mid = 0
        high = len(nums) - 1
        while mid <= high:
            if nums[mid] == 0:
                self.swap(nums, low, mid)
                low += 1
                mid += 1
            elif nums[mid] == 2:
                self.swap(nums, mid, high)
                high -= 1
            else:
                mid += 1

    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp

## Problem2 (https://leetcode.com/problems/3sum/)

# Time Complexity : O(n^2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Sort the array. Iterate over the array and for each element, set low to i + 1 and high to len(nums) - 1.
# Calculate the sum of the elements at i, low and high. If the sum is 0, append the elements to the result array. If the
# sum is less than 0, increment low. If the sum is greater than 0, decrement high.

class Solution(object):
    def threeSum(self, nums):
        result = []
        nums.sort()
        for i in range(len(nums)):
            if i != 0 and nums[i] == nums[i - 1]:
                continue
            low = i + 1
            high = len(nums) - 1
            while low < high:
                sum = nums[i] + nums[low] + nums[high]
                if sum == 0:
                    result.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -= 1
                    while low < high and nums[low] == nums[low - 1]:
                        low += 1
                    while low < high and nums[high] == nums[high + 1]:
                        high -= 1
                elif sum < 0:
                    low += 1
                else:
                    high -= 1
        return result

## Problem3 (https://leetcode.com/problems/container-with-most-water/)

# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Maintain 2 pointers low and high. Calculate the area using the formula min(height[low], height[high]) * (high - low).
# If the area is greater than the max area, update the max area. If height[low] < height[high], increment low. Else, decrement high.

class Solution(object):
    def maxArea(self, height):
        low = 0
        high = len(height) - 1
        maxArea = 0
        while low < high:
            area = min(height[low], height[high]) * (high - low)
            if area > maxArea:
                maxArea = area
            if height[low] < height[high]:
                low += 1
            else:
                high -= 1
        return maxArea
