class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        #Brute Force
        #Time: O(n*n)
        #Space: O(1)
        
        # n = len(height)
        # max_area = 0
        # for i in range(n-1):
        #     for j in range(i+1, n):
        #         max_area = max(max_area, min(height[i], height[j])*(j-i))
        # return max_area
        
        
        # Using 2 pointers
        # Time: O(n)
        # Space: O(1)
        n = len(height)
        left = 0
        right = n-1
        area = 0
        
        while(left<right):
            if height[left] < height[right]:
                area = max(area, height[left] * (right - left))
                left += 1
            else:
                area = max(area, height[right] * (right - left))
                right -= 1
        return area
        