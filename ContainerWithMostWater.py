# Time Complexity : O(n)
# Space Complexity : O(1)
class Solution:
    def maxArea(self, height):
        if not height:
            return 0
        
        n = len(height)
        i, j = 0, n - 1
        area = 0
        
        while i < j:
            area = max(area, min(height[i], height[j]) * (j - i))
            if height[i] < height[j]:
                i += 1
            else:
                j -= 1
        
        return area

# Example usage
solution = Solution()

# Example 1
height1 = [1, 8, 6, 2, 5, 4, 8, 3, 7]
print(solution.maxArea(height1))  # Expected output: 49

# Example 2
height2 = [1, 1]
print(solution.maxArea(height2))  # Expected output: 1

# Example 3
height3 = [4, 3, 2, 1, 4]
print(solution.maxArea(height3))  # Expected output: 16