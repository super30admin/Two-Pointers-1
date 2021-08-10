#Leetcode Problem: 11
class Solution:
    def maxArea(self, height: List[int]) -> int:
        left=0
        right=len(height)-1
        leftM=0
        rightM=0
        ans=0
        
        while(left<right):
            ans=max((min(height[left],height[right])*(right-left)),ans)
            if height[left]<height[right]:
                left+=1
            else:
                right-=1
            
        return ans

#TC: O(n)
#SC: O(1)