
#time complexity: O(n)
#time complexity: O(1)

class Solution:
    def maxArea(self, height: List[int]) -> int:
        if height==None or len(height)==0: return 0
        
        left=0
        right=len(height)-1
        maxi=-1
        
        while(left<right):
            product=min(height[left], height[right])*(right-left)
            if height[left]<height[right]:
                left+=1
            else:
                right-=1
                
            if product>maxi:
                maxi=product
                
        return maxi