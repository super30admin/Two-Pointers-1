''' 
Brute Force Solution 
Time Complexity: O(n^2)
Space Complexity: O(1) 

Approach: Explore all pairs of indices (i, j) where i < j and calculate the area formed by the lines at those indices.
'''
class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        maxArea = - 1
        for idx, val in enumerate(height):
            for j in range(idx+1,len(height)):
                maxArea = max(maxArea, min(height[j], val)*(j-idx))

        return maxArea 
            
''' 
Two Pointer Solution
Time Complexity: O(N)
Space Complexity: O(1)

Approach: We use two pointers, one to keep track of the left index and the other to keep track of the right index. 
We move the left pointer to the first index that is smaller than the current index, and the right pointer to the last index that is larger than the current index. 
Then, we calculate the area formed by the lines formed by the indices at the left and right pointers. 
We repeat this process until left and right pointers meet.
'''
class Solution:
    def maxArea(self, height: List[int]) -> int:
        N = len(height)
        left, right = 0, N - 1
        maxArea = -1
        while left < right:
            maxArea = max(maxArea, min(height[left], height[right]) * (right - left))
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1

        return maxArea