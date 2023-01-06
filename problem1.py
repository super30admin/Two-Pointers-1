#time O(n)
#space O(1)

class Solution:
    def maxArea(self, height: List[int]) -> int:
            area = 0
            left = 0
            right = len(height)-1

            while left <= right:
                    min_height = min(height[left],height[right])
                    width = right-left
                    area = max(area,min_height*width)

                    if height[left] < height[right]:
                        left += 1
                    else:
                        right -= 1
            return area

