#successfully submitted on Leetcode: yes
#Tc = o(n)
#Sc = O(1)

class Solution:
    def maxArea(self, height: List[int]) -> int:
        max_area = 0
        l = 0
        h = len(height) - 1
        
        while l < h:
            width = h - l
            height_temp = min(height[l], height[h])
            curr_area = width * height_temp
            max_area = max(max_area, curr_area)

            if height[l] <= height[h]:
                l += 1
            else:
                h -= 1
        
        return max_area
