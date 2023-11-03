#brute force
#TC: O(n^2), n is len of nums  
#SC: O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxarea = 0
        for left in range(len(height)):
            for right in range(left + 1, len(height)):
                width = right - left
                maxarea = max(maxarea, min(height[left], height[right]) * width)

        return maxarea
    
#TC :O(n)
#SC: O(1)
#LC: yes 11
#problems NA   
class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        left = 0
        right = n - 1
        maxAr = 0
        start = 0
        end = 0
        while left < right:
            currAr = min(height[left], height[right])*(right - left)
            if maxAr < currAr:
                start = left
                end = right
                maxAr = currAr
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        print(start, end)
        return maxAr

