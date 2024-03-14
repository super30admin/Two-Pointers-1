class Solution:
    def contianerWithWater(self, height):
        l = 0
        r = len(height)-1
        res = float('-inf')
        
        while l<r:
            area = (r-l)*min(height[l], height[r])
            res = max(res, area)
            if height[l] < height[r]:
                l+=1
            elif height[l] > height[r]:
                r-=1
            else:
                l+=1
                
        return res
            