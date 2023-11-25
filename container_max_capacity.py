class Solution:
    def maxArea(self, height: List[int]) -> int:
        left=0
        right=len(height)-1
        max1=0

        while left<right:
            max1=max(max1,((right-left)*min(height[left],height[right])))

            if height[left]<height[right]:
                left+=1
            else:
                right-=1
        return max1