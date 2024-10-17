# Two-Pointers-1

## Problem1 (https://leetcode.com/problems/sort-colors/)
time and space: O(n) and O(1) 
# Dutch National Flag Algorithm

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low = 0
        mid = 0 
        high = len(nums) - 1

        while mid <= high:
            # if mid is 0 swap low and mid and increment low and mid
            if nums[mid] == 0:
                nums[mid], nums[low] = nums[low], nums[mid]
                mid+=1
                low+=1
            # if mid is on mid do nothing
            elif nums[mid] == 1:
                mid+=1
            # if mid is 1 swap high and mid and decrement high
            else:
                nums[mid], nums[high] = nums[high], nums[mid]
                high-=1

        return nums
        

## Problem2 (https://leetcode.com/problems/3sum/)
# O(n^2), O(n)

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        nums.sort()
        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            j = i + 1
            k = len(nums) - 1

            while j < k:
                total = nums[i] + nums[j] + nums[k]

                if total == 0:
                    result.append([nums[i], nums[j], nums[k]])
                    j+=1
                    # to skip duplicates
                    while nums[j] == nums[j-1] and j < k:
                        j+=1
                elif total < 0:
                    j+=1
                else:
                    k-=1

        return result
        



## Problem3 (https://leetcode.com/problems/container-with-most-water/)
# water stored between vertical lines = 
# min height of both vertical lines * distance between them
# solution maintain currentMax
# move smaller pointer inward
# O(n), O(1)

class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0
        right = len(height) - 1
        maxArea = 0
        while left < right:
            currArea = min(height[left], height[right]) * (right - left)
            maxArea = max(maxArea, currArea)
            if height[left] < height[right]:
                left+=1
            else:
                right-=1
        return maxArea
