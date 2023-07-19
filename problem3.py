# Approach1: brute force 
# Time Complexity: O(n^2) 
# Space Complexity: O(1)
height = [1,8,6,2,5,4,8,3,7]
max_amount = 0
n = len(height)
for i in range(n):
    for j in range(i+1,n):
        if height[i] < height[j]:
            max_amount = max( max_amount, height[i] * (j-i))
        else:
            max_amount = max(max_amount, height[j] * (j-i))

print(max_amount)





# Approach2: Using 2 pointers 
# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def maxArea(self, height: List[int]) -> int:
        max_amount = 0
        n = len(height)
        left = 0
        right = n-1

        while left < right:
            breadth = min(height[left], height[right])
            length = right - left
            max_amount = max(max_amount, breadth * length)
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return max_amount
