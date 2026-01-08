class Solution:
    def maxArea(self, height: List[int]) -> int:
        l=0
        r=len(height)-1

        max_area=0

        while l<r:
            area=min(height[l],height[r])*(r-l)
            max_area=max(max_area,area)

            if height[l]<height[r]:
                l=l+1
            else:
                r=r-1
        return max_area


        