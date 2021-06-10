from typing import List

# Brute force Solution
# Time Complexity: O(n * n)
# Space Complexity: O(1)

# class Solution:
#     def maxArea(self, height: List[int]) -> int:
#         if height == None or len(height) == 0:
#             return 0
#         area = 0
#         for i in range(len(height)):
#             for j in range(i+1, len(height)):
#                 area = max(area,min(height[i],height[j]) * (j-i))
#         return area

class Solution:
    def maxArea(self, height: List[int]) -> int:
        if height == None or len(height) == 0:
            return 0
        area = 0
        left = 0
        right = len(height) - 1
        while left < right:
            if height[left] < height[right]: 
                area = max(area, height[left] * (right - left))
                left += 1
            else:
                area = max(area, height[right] * (right - left))
                right -= 1
            
        return area

obj = Solution()
print(obj.maxArea([1,8,6,2,5,4,8,3,7]))
print(obj.maxArea([1,1]))
print(obj.maxArea([4,3,2,1,4]))
print(obj.maxArea([1,2,1]))

# Time Complexity : O(n)
# Space Complexity: O(1)