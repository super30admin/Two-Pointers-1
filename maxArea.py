class Solution:
    def maxArea(self, height: List[int]) -> int:
        l = 0
        h = len(height) - 1
        area = 0
        
        while l<h:
            length = h-l
            b = min(height[l], height[h]) # min of two for containing at most
            
            if b*length>area:
                area = b*length
            
            if height[l]<=height[h]:
                l = l+1
            else:
                h = h-1
        
        return area
            
# initializing low and high pointer and finding the area. updating pointers based on comparisons with previously calculated 
# area and returning output in the end
# TC: O(N), SC: O(1)