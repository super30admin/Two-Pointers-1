# // Time Complexity :O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no
class Solution:
    def maxArea(self, height):  
        l=0
        r=len(height)-1
        
        maxarea=0
        
        while l<r:
            #check for area
            #area=width*height
            localarea=(r-l)*min(height[l],height[r])
            #choose maximum area
            maxarea=max(maxarea,localarea)
            
            #to decide which pointer has to be updated
            if height[l]<height[r]:
                l=l+1
                
            elif height[r]<height[l]:
                r=r-1
            else:
                #when left and right heights are same , can update either of 2 pointers
                r=r-1
        return maxarea
