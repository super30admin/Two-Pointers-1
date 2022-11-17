'''
Time Complexity --> O(n)
Space Complexity --> O(1)
'''

class Solution:
    def maxArea(self, height: List[int]) -> int:
        l = 0
        h = len(height)-1
        max_val = 0
        while l<h:
            max_val = max(max_val,min(height[l],height[h])*(h-l))
            if height[l]<height[h]:
                l+=1
            elif height[l]>height[h]:
                h-=1
            else:
                l+=1
                h-=1
        return(max_val)
            
        