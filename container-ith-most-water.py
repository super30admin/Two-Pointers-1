# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this :No
class Solution:
    def maxArea(self, height: List[int]) -> int:
        max_amt=0
        if len(height)==0:
            return 0
        
        l=0
        r=len(height)-1
        print("^^",l,r)
        while l<=r:
            max_amt=max((min(height[l],height[r])*(r-l)), max_amt)
            if height[l]<height[r]:
                l+=1
            else:
                r-=1
                
        return max_amt
                