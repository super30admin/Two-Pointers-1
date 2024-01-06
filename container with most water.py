class Solution:
    def maxArea(self, height: List[int]) -> int:
        left, right = 0, len(height)-1
        maxWater = 0
        while left < right:
            leftHold = height[left]
            rightHold = height[right]

            minHeight = min(leftHold,rightHold)
            currentMaxWater = minHeight * (right - left)
            
            maxWater = max(maxWater, currentMaxWater )

            if leftHold <= rightHold:
                left += 1
            else:
                right -= 1
    
        return maxWater

#Time complexity: O(N)
#Space complexity: O(1)
