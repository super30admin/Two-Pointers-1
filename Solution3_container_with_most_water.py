// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


'''
1. Use two pointers one at start and one at end.

2. Try to maximize the area by moving the pointer 
   towards the higher height
   
3. return the area

'''

class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        lp=0
        rp=len(height)-1
        
        area= 0 
        
        while lp < rp:
            
            area =max(area,(rp-lp)*min(height[rp],height[lp]))
            
            if height[lp] < height[rp]:
                lp=lp+1
            else:
                rp=rp-1
        return area
            
        
        