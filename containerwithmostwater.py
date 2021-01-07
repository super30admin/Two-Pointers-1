class Solution:
    def maxArea(self, height: List[int]) -> int:
        # Time Complexity: O(n)
        # Space Complexity: O(1)
        i=0
        j = len(height)-1
        max1 = min(height[i],height[j])*(j-i)
        
        while(j>i):
            if(max1 < min(height[i],height[j])*(j-i)):
                max1 = min(height[i],height[j])*(j-i)
            
            if(height[i]<=height[j]):
                i+=1
            else:
                j-=1
        return max1
