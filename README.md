# Two-Pointers-1

## Problem1 (https://leetcode.com/problems/sort-colors/)

# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

# Your code here along with comments explaining your approach
# We are using 3 pointers to collect 3 different items, i.e., pointer 1 to collect 0's, pointer 3 to collect 2's, and pointer 1 to check each element and to implicitly collect 1's
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        left, mid, right = 0, 0, len(nums) - 1

        while mid <= right:
            if nums[mid] == 1:
                mid += 1
            elif nums[mid] == 0:
                nums[left], nums[mid] = nums[mid], nums[left]
                left += 1
                mid += 1
            else:
                nums[right], nums[mid] = nums[mid], nums[right]
                right -= 1
                


## Problem2 (https://leetcode.com/problems/3sum/)

# Time Complexity : O(n^2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

# Your code here along with comments explaining your approach
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # fix first number
        # target + left + right should = 0
        # use two pointers to find the sum
        result = []
        sorted_nums = sorted(nums)
        n = len(sorted_nums)
        for i in range(n - 2):
            if i > 0 and sorted_nums[i] == sorted_nums[i - 1]:
                continue

            left = i + 1
            right = n - 1

            while left < right:
                total = sorted_nums[i] + sorted_nums[left] + sorted_nums[right]

                if total == 0:
                    result.append([sorted_nums[i], sorted_nums[left], sorted_nums[right]])
                
                    while left < right and sorted_nums[left] == sorted_nums[left + 1]:
                        left += 1
                    while left < right and sorted_nums[right] == sorted_nums[right - 1]:
                        right -= 1

                    left += 1
                    right -= 1
                elif total < 0:
                    left += 1
                else:
                    right -= 1
        return result    


## Problem3 (https://leetcode.com/problems/container-with-most-water/)

# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

# Your code here along with comments explaining your approach
class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        max_area = 0
        left, right = 0, n-1
        while left < right:
            vol = (right - left)*min(height[left], height[right])
            max_area = max(max_area, vol) 
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        
        return max_area
