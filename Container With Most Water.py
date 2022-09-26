
# Your code here along with comments explaining your approach
# TC - O(n)
# two pointers approach
class Solution:
    def maxArea(self, height):
        n = len(height)
        left = 0
        right = n-1
        while(left < right):
            currArea = min(height[left],height[right]) * (right-left)
            Max = max(Max,currArea)
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return Max

#brute force
#TC - O(n^2)
class Solution:
    def maxArea(self, height):
        Max = 0
        n = len(height)
        for i in range(0,n):
            for j in range(i+1,n):
                Max = max(Max,min(height[i],height[j]) * (j-i))
        return Max
    