class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        if len(height) == 2:
            return min(height[0],height[1])
        
        l= 0
        h= len(height)-1
        max_water = 0
        
       # print(height[l],height[h])
        while l < h:
            current_water = min(height[l],height[h]) *(h-l)
            if current_water > max_water:
                max_water = current_water
          #  print(height[l],height[h])
            if height[l] < height[h]:
          #      print("if1")
                l+=1
            else:
         #       print("if2")
                h-=1
       
        
        return max_water
            
        