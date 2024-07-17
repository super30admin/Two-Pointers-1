class Solution:
    # Time Complexity: O(N)
    # Space Complexity: O(1)
    # Method-2 Optimal solution
    def maxArea(self, height: List[int]) -> int:
        area = 0
        for i in range(len(height)-1):
            for j in range(i+1, len(height)):
                # length = min(height[i],height[j])
                # width = j-i
                area = max((min(height[i],height[j]))*(j-i), area)
        return area
        
    # Method-1 (Time limit exeeded)
    # Time Complexity: O(N*N)
    # Space Complexity: O(1)
    def maxArea(self, height: List[int]) -> int:
        area = 0
        low = 0
        high = len(height)-1
        while low < high:
            width = high-low
            length = min(height[low],height[high])
            area = max(length*width, area)
            if height[low] <= height[high]:
                low += 1
            else:
                high -= 1
        return area
    
