#LC_11
# Time Complexity : O(N)
# Space Complexity : O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
            begin, end = 0, len(height) - 1
            area = 0
            while begin != end:
                if height[begin] < height[end]:
                    t = height[begin]*(end - begin)
                    area = max(area,t)
                    begin += 1
                else:
                    t = (height[end]*(end - begin))
                    area = max(area,t)
                    end -= 1

            return area
        