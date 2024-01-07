class Solution:
    def maxArea(self, height: List[int]) -> int:
        
#   Brute Force - TLE
#         a = 0
        
#         for i in range(len(height)):
            
#             for j in range(i+1, len(height)):
                
#                 l = min(height[i], height[j])
#                 w = j - i
                
#                 a = max(a, l*w)
                
                
#         return a


        l = 0
        r = len(height) - 1
        a = 0
        max_a = 0
        
        while(l<r):
            a = min(height[l], height[r])*(r-l)
            max_a = max(max_a, a)
            if height[l] < height[r]:
                l = l+1
            else:
                r = r-1
        
        return max_a
