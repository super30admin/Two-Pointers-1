#Time Complexity: O(n)
#Space Complexity: O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        l=0
        r=len(height)-1
        maxarea=0
        area=0
        start=0
        end=0
        while l<r:
            #For returning indices
            area=min(height[l],height[r])*(r-l)
            if maxarea<area:
                start=l
                end=r
                maxarea=area   
            #maxarea=max(maxarea,min(height[l],height[r])*(r-l))
            if height[l]<=height[r]:
                l+=1
            else:
                r-=1
        print(start,end)
        return maxarea
            