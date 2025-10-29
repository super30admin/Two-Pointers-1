# Problem => To return what is the maximum amount of water we can store in between two walls

# Time: O(n^2)
# Space: O(1)
# Use nested loops to calculate the width and height from the wall i to j
# Keep track of the max area
class Solution:
    def maxArea(self, height: List[int]) -> int:
        maximum = 0
        for i in range(len(height)):
            for j in range(len(height)):
                w = j - i
                h = min(height[i],height[j])
                maximum =max(h*w,maximum)

        return maximum
    
# Time: O(n)
# Space: O(1)
# Use Two pointers low and high and loop until low < high
# widht will be high - low to update the low or high pointer we need to check the constraining height i.e the min between those 2 heights
# then calculate the area for calculated width and height and keep track of the max area

class Solution:
    def maxArea(self, height: List[int]) -> int:
        low = 0
        high = len(height) - 1
        max_area = 0

        while low < high:
            width = high - low
            if height[low] < height[high]:
                max_area = max(max_area, width * height[low])
                low += 1
            else:
                max_area = max(max_area, width * height[high])
                high -= 1

        return max_area
