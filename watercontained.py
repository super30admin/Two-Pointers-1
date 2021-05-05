"""Container With Most Water
Time Complexity - O(n)
Space Complexity - O(1)

approach - 2 pointers. 
area is constrained by the minimum height of the lines contained. """

class Solution:
    def maxArea(self, height: List[int]) -> int:
        if( height ==None and len(height)==0):
            return 0
        maxarea =0
        left = 0
        right = len(height)-1
        while left<right:
            maxarea=max(maxarea,(right-left)*min(height[right],height[left]))
            if height[left]<height[right]:
                left+=1
            else:
                right-=1
        return maxarea
                
            
        