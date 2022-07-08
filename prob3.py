class Solution:
    def maxArea(self, height: List[int]) -> int:
        l = 0
        r = len(height)-1
        print(r)
        print(l)
        max = 0
        while(l<r):
            if(height[l] < height[r]):
                temp = (r-l) * min(height[r],height[l]) 
                if (temp > max):
                    max = temp
                l += 1
            elif(height[l] == height[r]):
                temp = (r-l) * min(height[r],height[l])
                if (temp > max):
                    max = temp
                l += 1
            else:
                temp = (r-l) * min(height[r],height[l])
                if (temp > max):
                    max = temp
                r -= 1
            
        return max
                
        