# Time Complexity : O(n)
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : yes	
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxArea1 =0
        l=0
        r= len(height)-1
        while(l<r):
            maxArea1 = max(maxArea1,min(height[l],height[r])*(r-l))
            if (height[l]<height[r]):
                l+=1
            else:
                r-=1
        return maxArea1