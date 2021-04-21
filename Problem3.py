## Problem3 (https://leetcode.com/problems/container-with-most-water/)
# Time Complexity - O(n)
# Space Complexity - O(1)


class Solution:
    def maxArea(self, height: List[int]) -> int:
        if not height:
            return -1
        area = 0
        left = 0
        right = len(height)-1
        while(left<right):
            # print((right-left)*(min(height[left],height[right])))
            area = max(area, (right-left)*(min(height[left],height[right])))
            if(height[left] <= height[right]):
                left+=1
                while(height[left] < height[left-1]):
                    left+=1
            else:
                right-=1
                while(height[right] < height[right+1]):
                    right-=1
        return area
        
                
            
        