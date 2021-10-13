class Solution:
    def maxArea(self, height: List[int]) -> int:
        #TC O(n)
        #SC O(1)
        if height is None or  len(height) == 0:
            return 0
        maxarea = 0
        low = 0
        high = len(height)-1
        while (low < high):
            maxarea = max(maxarea, min(height[low],height[high]) * (high-low))
            if height[low] < height[high]:
                low += 1
            else:
                high -=1
        return maxarea
        
        # Brute force Time limit exceeded
        # maxarea = 0
        # for i in range (len(height)):
        #     for j in range(i+1,len(height)):
        #         maxarea = max(maxarea, min(height[i],height[j]) * (j-i))
        # return maxarea
