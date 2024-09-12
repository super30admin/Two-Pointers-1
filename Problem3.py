#Time Complexity - O(n)
#Space Complexity - O(1)

class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        ans=0
        left=0
        right=len(height)-1
        
        while left<right:
            
            ans=max(ans,min(height[left],height[right])*(right-left))
            print("----")
            print(ans)
            if height[left]<height[right]:
                left=left+1
            else:
                right=right-1
            
        return ans