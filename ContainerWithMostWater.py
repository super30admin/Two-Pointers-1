from pip import List
#Time Complexity = O(n)
#Space Complexity = O(1)

class Solution:
    def maxArea(self, height: List[int]) -> int:
        if(len(height)==0):
            return 0
        left = 0
        right = len(height)-1
        max_val = 0
        
        while(left<=right):
            max_val = max(max_val, min(height[right],height[left])*(right-left))
            if(height[right]<height[left]):
                right-=1
            else:
                left+=1
        return max_val
            
        