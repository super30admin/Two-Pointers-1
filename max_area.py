# Time Complexity : O(N) when N is number of elements
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def maxArea(self, height) -> int:
        max_water = 0
        
        left, right = 0, len(height) - 1
        
        while left < right:
            h = min(height[left], height[right])
            water = h * (right - left)
            
            max_water = max(water, max_water)
            
            if height[left] <= height[right]:
                left += 1
            else:
                right -= 1
                
        return max_water

solution = Solution()
print(f'OUTPUT >> {solution.maxArea([1,8,6,2,5,4,8,3,7])}')