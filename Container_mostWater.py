class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxwater = 0
        if not height:
            return
        low = 0
        high = len(height)-1
        while low<high:
            maxwater=max(maxwater, (high-low)*min(height[low], height[high]))
            if height[low]<height[high]:
                low+=1
            else:
                high-=1
        return maxwater
            
        
        # maxWater = 0
        # if not height:
        #     return 
        # for i in range(len(height)):
        #     for j in range(i+1, len(height)):
        #         maxWater = max(maxWater, (j-i)*min(height[i], height[j]))
        # return maxWater
        
"""Time Complexity - O(n)
Space Complexity - O(1)"""
        
                
        