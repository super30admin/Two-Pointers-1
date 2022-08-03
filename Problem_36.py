# Time Complexity : O(n) in a single pass
# Space Complexity : O(1) or constant auxiliary space complexity
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def maxArea(self, height: List[int]) -> int:
        ########## OPTIMAL SOLN O(n) time and O(1) space
        area = 0
        l = 0
        r = len(height) - 1
        while l < r:
            area = max(area, (r-l)*min(height[l],height[r]))
            if height[l] < height[r]:
                l+=1
            else:
                r-=1
        return area
    
    ############### Brute Force Soln ##################
    ########## Time Limit Exceeded , O(n^2) Soln #############
#         area = 0
        
#         for i in range(len(height)):
#             for j in range(i+1, len(height)):
#                 area = max(area, (j-i)*min(height[i],height[j]))
#         return area
                
            