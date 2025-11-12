class Solution:
    def maxArea(self, heights: List[int]) -> int:
        l = 0 
        r = len(heights)-1 
        maxArea = 0 
        while l < r:
            if heights[l] < heights[r]:
                maxArea = max(maxArea,heights[l] * (r-l))
                l += 1 
            else: 
                maxArea = max(maxArea,heights[r] * (r-l))
                r -= 1 
        return maxArea

# Start with two pointers — one at the left end and one at the right end of the array. At each step, find the area between the two lines and keep track of the largest one. Move the pointer with the smaller height inward to try and find a bigger area. Keep doing this until the two pointers meet.
# Time: O(n)
# Space: O(1)