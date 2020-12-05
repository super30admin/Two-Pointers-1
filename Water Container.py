# Time: O(N)
# Space: O(1)

class Solution:
    def maxArea(self, height):
        left, right = 0, len(height)-1
        maxarea = 0

        while left < right:
            area = min(height[left], height[right]) * (right - left)
            maxarea = max(area, maxarea)
            if height[left] <= height[right]:
                left += 1
            else:
                right -= 1

        return maxarea

if __name__ == "__main__":
    print(Solution().maxArea([1,1]))
    print(Solution().maxArea([1, 2, 1]))
    print(Solution().maxArea([4,3,2,1,4]))
    print(Solution().maxArea([1,8,6,2,5,4,8,3,7]))


