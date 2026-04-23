class Solution:
    def maxArea(self, height):
        n = len(height)
        left = 0
        right = n - 1
        result = 0
        while left < right:
            result = max(result, (right - left) * min(height[left], height[right]))
            if height[left] > height[right]:
                right -= 1
            else:
                left += 1
        return result
    
nums=[2,0,1]
sl = Solution()
  
print(sl.maxArea(nums))