class Solution:
    def maxArea(self, height: List[int]) -> int:
        #initializing two pointers and area
        lo=0
        area=0
        hi=len(height)-1
        while lo<hi:
            #condition to find max area
            area=max(area,((min(height[lo],height[hi])*(hi-lo))))
            #cheching condition to move pointer towards solution
            if height[lo]<height[hi]:
                     lo+=1
            else:
                     hi-=1
        return area

#Time-Complexity: O(n)
#Space-Complexity: O(1)