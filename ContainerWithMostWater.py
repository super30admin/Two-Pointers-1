#good program further in thecopy..
class Solution:
    def maxArea(self,height):
        i=0
        j=len(height)-1
        
        maxarea=0        
        while(i<j):            
            cal=min(height[j],height[i])*(j-i)
            maxarea=max(cal,maxarea)
            if height[j]>height[i]:
                i+=1
            else:
                j-=1
        return(maxarea)
sol=Solution()
l1=[1,2,1]
print(sol.maxArea(l1))

Time is O(n)
Space is O(1)
