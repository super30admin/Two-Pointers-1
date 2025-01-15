#time: O(n)
#space: O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        left= 0
        right = n-1
        max_ar =0
        while( left < right):
                
            max_ar= max(max_ar, min(height[left],height[right])* (right-left))
            if( height[left] > height[right]):
                right = right -1 
            else:
                left= left +1
        return max_ar
        
