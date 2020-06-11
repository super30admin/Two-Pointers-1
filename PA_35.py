#LC 11 - Container With Most Water
#Time Complexity - O(n)
#Space Complexity - O(1)
class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        if not height:
            return 0
        low = 0
        high = len(height)-1
        ans = 0
        while low < high:
            area = (high - low) * min(height[low],height[high])
            ans = max(area,ans)
            #print(low,high)
            if height[low] < height[high]:
                low = low + 1
            else:
                high = high - 1
        
        return ans