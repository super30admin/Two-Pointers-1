#Time Complexity : O(n)
#Space Complexity : O(1)

class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0
        right = len(height)-1
        maxArea = 0
        while(left < right):
            ht = min(height[left],height[right])
            maxArea = max(maxArea, ht*(right-left))
            if(height[left] < height[right]):
                left += 1
            else:
                right -= 1
        return maxArea
