# // Time Complexity :O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this :NO


# // Your code here along with comments explaining your approach
class Solution:
    def maxArea(self, height: List[int]) -> int:
        low = 0
        high = len(height)-1
        res = 0
        while low<high:
            area = min(height[low],height[high])*(high-low)
            res = max(area,res)
            if height[low]<height[high]:
                low+=1
            else:
                high-=1
        return res