class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """

        if len(height) == 0:
            return -1
        
        low = 0
        high = len(height)-1
        currArea = -1
        


        while(low < high):
            result = min(height[low],height[high]) * (high-low)
            print(result)
            currArea = max(currArea,result) 

            if height[low]<=height[high]:
                low = low + 1
            else:
                high = high - 1

        return currArea



        
        
Console
