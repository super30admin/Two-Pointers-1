class Solution:
    def maxArea(self, height) :
        if height == None or len(height) == 0:
            return 0
        low = 0
        high = len(height) - 1
        max_area = 0

        while low < high:
            area = (high - low) * min(height[high], height[low])
            max_area = max(max_area, area)
            if height[high] < height[low]:
                high = high - 1
            else:
                low = low + 1
        return max_area
sol=Solution()
h=[1,2,3,2,5,4,8,3]
print(sol.maxArea(h))