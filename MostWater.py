#11. Container With Most Water
#Tc -> 0(n)
#Sc -> O(1)


class Solution:
    maximum = 0
    def maxArea(self, height: List[int]) -> int:
        if(len(height) < 2):
            return -1
        low = 0
        high = len(height) -1
        
        while(low < high):
           
            area = ((high-low)* min(height[low],height[high]))
            self.maximum = max(area,self.maximum)
            
            if(height[low]<height[high]):
                low+=1
            else:
                high-=1
        return self.maximum
        
            