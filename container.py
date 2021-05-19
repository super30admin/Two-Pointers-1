class Solution:
    def maxArea(self, height: List[int]) -> int:
        '''
        TC : O(N)
        SC : O(1)
        Approach : 
            Use two pointers one from left and one from right
            find the area and move to center by changing the pointer having less height
            as the area is dependent on lower height
        '''
        m = 0 
        low = 0 
        high = len(height) - 1
        while low < high:
            m = max(m, min(height[low],height[high]) * (high - low))
            if height[low] <height[high]:
                low += 1
            else:
                high -= 1
        return m
        
        