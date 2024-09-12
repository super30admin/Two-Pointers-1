# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxi=0
        l=0
        r=len(height)-1
        while l<=r:
            if height[l]<height[r]:
                maxi=max(maxi,height[l]*(r-l))
                l+=1
            else:
                maxi=max(maxi,height[r]*(r-l))
                r-=1
        return maxi
            