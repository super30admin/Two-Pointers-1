# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach 

def container(heights):
    if heights == None or len(heights) == 0:
        return 0
    left = 0
    right = len(heights) - 1
    mx = float('-inf')

    for i in range(0, len(heights)):
        if heights[left] < heights[right]:
            currArea = heights[left] * (right-left)
            left += 1
        else:
            currArea = heights[right] * (right-left)
            right -= 1
        mx = max(mx, currArea)
    return mx

print container([1,8,6,2,5,4,8,3,7])
