# https://leetcode.com/problems/container-with-most-water/
# Time O(N) : Length of height array
# Space O(1) : No extra space used

class Solution:
    def maxArea(self, height):
        
        area, left, right = 0, 0, len(height) -1
        
        while left <= right:
            
            area = max(area, (right- left)*min(height[left], height[right]))
            
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
                
        return area

height = [1,8,6,2,5,4,8,3,7]
s = Solution()
output = s.maxArea(height)
print(output)