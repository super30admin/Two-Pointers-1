class Solution:
    def maxArea(self, height: List[int]) -> int:
        area, start, end = 0, 0, len(height)-1
        for count in range(len(height)):
            width = abs(start - end)
            if height[start]<height[end]:
                result = width * height[start]
                start += 1
            else:
                result = width * height[end]
                end -= 1
            if result > area:
                area = result
        return area