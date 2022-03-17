#Time Complexity : O(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : YES
#Any problem you faced while coding this : NO
class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        start = 0
        end = len(height) - 1
        maxx = 0
        
        while start < end:
            minheight = min(height[start],height[end])
            area = minheight * (end - start)
            maxx = max(maxx,area)
            if minheight == height[start]:
                start +=1
            else:
                end -=1
            
        return maxx