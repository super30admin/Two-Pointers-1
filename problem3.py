'''
11. Container With Most Water

APPROACH: Two pointers
TIME COMPLEXITY: O(n)
SPACE COMPLEXITY: O(1)
LEETCODE: Yes
DIFFICULTY: Nope, as I have already watched the class
'''

class Solution:
    def brute_force(self, height):
        n = len(height)
        area = 0
        for i in range(0, n):
            for j in range(i+1, n):
                area = max(area, min(height[i], height[j])*(j-i) )
                
        return area
    

    def two_pointer(self, height):
        n = len(height)
        area = 0
        p1 = 0
        p2 = n-1
        
        while p1 != p2:
            area = max(area, min(height[p1], height[p2])*(p2-p1) )
            if height[p1] == height[p2]:
                p1+= 1
            elif height[p1] < height[p2]:
                p1 += 1
            else:
                p2 -= 1
        
        return area
    
    def maxArea(self, height: List[int]) -> int:
        # return self.brute_force(height)
        return self.two_pointer(height)    
