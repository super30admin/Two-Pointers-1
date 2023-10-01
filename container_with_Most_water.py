#Time complexity: O(N)
#Space complexity:O(1)

class Solution:
    def maxArea(self, height: List[int]) -> int:
        left=0
        right=len(height)-1
        max_water=0

        while left<right:
            line=min(height[left],height[right])
            weight=right-left
            max_water=max(max_water,(line*weight))
            
            if(height[left] < height[right]):
                left +=1
            else:
                right -=1

        return max_water

        