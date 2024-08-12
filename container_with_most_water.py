# time complexity = O(n^2)
# space complexity = O(1)
# tested on leetcode
# brute force solution
class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        max_val = -1
        for i in range(n):
            for j in range(i+1, n):
                max_val = max(max_val, (j-i)*min(height[i],height[j]))
        return max_val

# time complexity = O(n)
# space complexity = O(1)
# tested on leetcode
# Two pointers solution
class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0
        right = len(height) - 1
        max_area = -1
        while(left < right):
            if height[left] <= height[right]:
                max_area = max(max_area, (right-left) * height[left])
                left += 1
            else:
                max_area = max(max_area, (right-left) * height[right])
                right -= 1
        return max_area
