# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

left, right = 0, len(height) - 1
maxwater = 0

while left < right:
    maxwater = max(maxwater, (right-left) * min(height[left], height[right]))
    if height[left] <= height[right]:
        left += 1
    else:
        right -= 1

return maxwater