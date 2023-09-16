# Time Complexity O(n)
# Space Complexity O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        l, r = 0, len(height) - 1
        _max_area = 0
        while l <= r:
            _height = min(height[l], height[r])
            _width = r - l
            _temp_area = _height * _width

            if _temp_area > _max_area:
                _max_area = _temp_area

            if height[l] < height[r]:
                l += 1
            else:
                r -= 1

        return _max_area