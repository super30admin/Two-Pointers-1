'''
1. We use 2 pointers l and r to find the max area. We start with l at 0 and r at n-1
2. We calculate area as the min of heights of left and right * width and update the max area accordingly 
3. We increment l if the height of l is less than height of r and decrement r otherwise

TC: O(n)
SC: O(1)
'''

class Solution:
    def maxArea(self, height: List[int]) -> int:

        if height == None or len(height) == 0:
            return 0
        
        Max = 0
        n = len(height)

        l = 0
        r = n-1

        while(l<r):
            Max = max(min(height[l],height[r])*(r-l),Max)
            if height[l]<height[r]:
                l+=1
            else:
                r-=1
        return Max