class Solution:
    # leetcode URL : https://leetcode.com/problems/container-with-most-water/
    # Problem : 11. Container With Most Water
    # Time Complexity : O(n)
    # Space Complexity : O(1)
    def maxArea(self, height: List[int]) -> int:
        area = -1
        s = 0
        e = len(height)-1
        while s<e:
            area = max(area,(e-s)*min(height[s],height[e]))
            if height[s]<height[e]:
                s = s+1
            else:
                e = e-1
        return area
        