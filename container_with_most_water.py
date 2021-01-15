# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
# I use start and end pointer to calculate area between current numbers and
# move pointers inwards only if there is a chance that the area would increase.
class Solution:
    def maxArea(self, height: List[int]) -> int:
        start = 0
        end = len(height) - 1
        
        max_area = min(height[start],height[end])*(end-start)

        if height[start] < height[end]:
            start += 1
        else:
            end -= 1
        
        while start < end:
            area = min(height[start],height[end])*(end-start)
            if area > max_area:
                max_area = area
            
            if height[start] < height[end]:
                start += 1
            elif height[start] > height[end]:
                end -= 1
            else:
                start += 1
                end -= 1
                
        return max_area