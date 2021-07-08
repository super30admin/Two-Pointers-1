class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxwater=float("-inf")
        left=0
        right=len(height)-1
        while(left<right):
            water=(right-left)*min(height[right],height[left])
            maxwater=max(maxwater,water)
            if height[right]<height[left]:
                right-=1
            else:
                left+=1
         
        if maxwater==float("-inf"):
            return 0
        return maxwater
        #Time O(n)
        #Space O(1)
        #Ran successfully
        
