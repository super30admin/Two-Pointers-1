class Solution:
    def BruteForce(self, height):
        max_area = float("-inf")
        for i in range(len(height)-1):
            for j in range(i+1, len(height)):
                max_area = max(max_area, min(height[i], height[j]) * (j-i))
        return max_area

    def optimalSolution(self, height):
        max_area = float("-inf")
        low, high = 0, len(height) - 1

        while low < high:
            max_area = max(max_area, min(height[low], height[high])*(high-low))
            if height[low] < height[high]:
                low += 1
            else:
                high -= 1
        return max_area
