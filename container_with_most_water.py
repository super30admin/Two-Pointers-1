class Solution:
    def maxArea(self, height: List[int]) -> int:
        '''
        Time Complexity: O(n)
        Space Complexity: O(1)
        '''
        l, r = 0, len(height) -1

        area = 0

        while (l < r):
            area = max(area, (r-l)*(min(height[l], height[r])))

            if height[l] < height[r]:
                l += 1
            else:
                r -= 1
        return area