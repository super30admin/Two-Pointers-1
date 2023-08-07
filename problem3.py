#Time Complexity : O(n)
#Space Complexity : O(1)
#Any problem you faced while coding this : -

#The approach is to maintain two pointers to calculate area between two boundaries. Change the left or right boundaries based on whichever is the smallest, however, max area is stored at every point.
class Solution:
    def maxArea(self, height: List[int]) -> int:
        i = 0
        j = len(height)-1
        result = 0
        
        while(i < j):
            area = (j - i) * min(height[j],height[i])
            result = max(result, area)

            if height[i] > height[j]:
                j -= 1
            else:
                i += 1
        
        return result