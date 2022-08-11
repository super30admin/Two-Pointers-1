
"""
LC : MAXIMUM WATER

TC : O(n)
SC : O(1)

Start from the two ends(max width) and move away from the smaller of the two height in case the next bar is higher than the current small

Keep in mind that for any 2 ends, the constraining bar would be the smaller one

"""

class Solution:
    def maxArea(self, height: list[int]) -> int:
        if(len(height)==0) :
            return 0

        maxArea = 0
        left = 0
        right = len(height)-1
        start = 0
        end = len(height)-1

        while left<right:
            width = right-left
            currArea = min(height[left], height[right]) * (width)
            if currArea>maxArea : 
                maxArea = currArea
                start = left
                end = right
            if(height[left]<=height[right]):
                left+=1
            else:
                right-=1

        return maxArea

height = [1,8,6,2,5,4,8,3,7]
object = Solution()
ans = object.maxArea(height)
print(ans)

            
        


            
            

