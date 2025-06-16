# 2 pointers
#Start with two pointers at both ends and keep checking the area between them.
#Move the pointer pointing to the shorter line.
#Keep track of the maximum area found during this process.
# Time Complexity:O(n)
# Space Complexity:O(1)

class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        low = 0
        high = n - 1
        area = 0
        while low < high:
            h = 0
            w = high - low
            if height[low] < height[high]:
                h = height[low]
                low += 1
            else:
                h = height[high]
                high -= 1
            area = max(area, h * w)
        return area

# # Brute Force
# # Try every pair of lines and calculate how much water they can hold.
# # The water is limited by the shorter line and the distance between them.
# # Keep updating the max area found so far.
# # Time Complexity:O(n^2)
# # Space Complexity:O(1)
# class Solution:
#     def maxArea(self, height):
#         n = len(height)
#         area = 0
#         for i in range(n):
#             for j in range(i+1, n):
#                 h = min(height[i], height[j])
#                 area = max(area, h * (j - i))
#         return area
