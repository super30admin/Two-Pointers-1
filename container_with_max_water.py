class Solution:
    def maxArea(self, height: List[int]) -> int:

        left=0
        right=len(height)-1
        area=0
        while left<=right:
            area = max(area,min(height[left],height[right])*(right-left))

            if height[right]>height[left]:
                left+=1
            else:
                right-=1

        return area
