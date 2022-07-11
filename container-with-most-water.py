""" Optimized Version
Runtime Complexity:
O(n) - because we traverse all the elements using left and right pointers to compute the max.
Space Complexity:
O(1) - no extra space was created to compute the solution.
Yes, the code worked on leetcode.
"""


class Solution:
    def maxArea(self, height: List[int]) -> int:
        if len(height)==0:
            return 0
        left = 0
        right = len(height)-1
        max_= 0
        while(left<=right):
            max_ = max(max_, min(height[left],height[right])*(right-left))
            if height[left]<height[right]:
                left+=1
            else:
                right-=1
        return max_


""" Bruteforce- timelimit exceeded.
Runtime Complexity:
O(n^2) - because we traverse all the elements using nested for loop.
Space Complexity:
O(1) - no extra space was created to compute the solution.
Yes, the code worked on leetcode.
"""

class Solution:
    def maxArea(self, height: List[int]) -> int:
        if len(height)==0:
            return 0
       
        max_= 0
        for i in range(len(height)-1):
            for j in range(i+1,len(height)):
                max_ = max(max_, min(height[i],height[j])*(j-i))
        return max_
            
            
            
        
            
        
            
        
            
        