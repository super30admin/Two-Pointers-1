#Time Complexity: O(n)
#Space Complexity: O(1)

# I have used 2 pointer approach for this, decrement or increment the pointers based on height
class Solution:
    def maxArea(self, height: List[int]) -> int:
        i=0
        j=len(height)-1
        Area = 0
        while i<j:
            inner_area=0
            width=j-i
            #Area is min of both heights and width is the difference in index
            inner_area=min(height[i],height[j])*width
            if inner_area>Area:
                Area=inner_area
            if height[i]<height[j]:
                i=i+1
            else:
                j=j-1
        
        return Area