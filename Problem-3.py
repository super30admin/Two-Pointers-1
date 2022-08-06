#  11. Container With Most Water
'''
Leetcode all test cases passed: Yes
class Solution:
    def maxArea(self, height: List[int]) -> int:
        n is the length of height
        Space Complexity: O(1)
        Time Complexity: O(n)
'''
class Solution:
    def maxArea(self, height: List[int]) -> int:
        l =0 
        r = len(height) - 1
        max_area = 0
        while l <= r:
            
            max_area = max(min(height[l],height[r]) * (r - l),max_area)
            if height[l] > height[r]:
                r -= 1
            else:
                l += 1
        return max_area
                
