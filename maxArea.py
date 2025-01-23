def maxArea(height: List[int]) -> int:
    left, right = 0, len(height) - 1
    maxArea = 0
    
    while left < right:
        minHeight = min(height[left], height[right])
        width = right - left
        currentArea = minHeight * width
        maxArea = max(maxArea, currentArea)
        
        if height[left] < height[right]:
            left += 1
        else:
            right -= 1
            
    return maxArea
#Time Complexity: O(n) - where n is the length of the array. We traverse the array once with two pointers.

#Space Complexity: O(1) - we only use a constant amount of extra space.
