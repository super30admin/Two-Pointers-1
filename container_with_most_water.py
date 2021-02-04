'''
Time complexity: O(n)
Space complexity: O(1)
Implementation: if h[left] < h[right]: Increment left
if h[left] > h[right]: Decrement right
if h[left] == h[right]: either decrement right or increment left , Here, we have decremented right
'''
class Solution:
    def maxArea(self, height):
        if height is None or len(height) == 0:
            return 0
        maxV = 0
        left = 0
        right = len(height) - 1
        
        while left < right:
            maxV = max(maxV, (right - left) * min(height[left], height[right]))
            if height[left] < height[right]:
                left = left + 1
            else:
                right = right - 1
        return maxV

# Driver code
s = Solution()
height = [1,8,6,2,5,4,8,3,7]
print(s.maxArea(height))