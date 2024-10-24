# Two-Pointers-1

## Problem1 (https://leetcode.com/problems/sort-colors/)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        left,n=0, len(nums)
        while left<n-1:
            for right in range(left+1, n):
                if nums[right]<nums[left]:
                    nums[left], nums[right]=nums[right], nums[left]
            left+=1 
            
## Problem2 (https://leetcode.com/problems/3sum/)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()

        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            
            j = i + 1
            k = len(nums) - 1

            while j < k:
                total = nums[i] + nums[j] + nums[k]

                if total > 0:
                    k -= 1
                elif total < 0:
                    j += 1
                else:
                    res.append([nums[i], nums[j], nums[k]])
                    j += 1

                    while nums[j] == nums[j-1] and j < k:
                        j += 1
        
        return res

## Problem3 (https://leetcode.com/problems/container-with-most-water/)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        left, right = 0, len(height)-1

        largest_number = max(height)
        largest = 0

        # While it is still possible to find a greater sum
        while (right-left)*largest_number > largest:
            area = min(height[left], height[right]) * (right - left)
            if area > largest:
                largest = area
            
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        
        return largest
