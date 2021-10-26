#time complexity O(n) and space O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        i=0
        j=len(height)-1
        maxarea=0
        curarea=0
#Traversing from start to end
        while i<len(height)-1:
# calculating area for current height and storing maximum area
            curarea = min(height[i],height[j])*(j-i)
            maxarea=max(maxarea,curarea)
# Checking the height            
            if height[i]>height[j]:
                j-=1
            else:
                i+=1
                
        return maxarea
