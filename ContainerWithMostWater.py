class Solution:
    def maxArea(self, height: List[int]) -> int:
        """
        Compare areas
        low starts at 0, high starts at len(height)-1
        """
        low = 0
        high = len(height) - 1
        maximum = 0
        while low < high:
            length = high - low
            breadth = min(height[low], height[high])
            maximum = max(maximum, length*breadth)
            
            if height[low] < height[high]:
                low += 1
            else:
                high -= 1
        return maximum