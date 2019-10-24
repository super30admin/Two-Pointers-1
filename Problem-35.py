
# container with most water -11
# time complexity -O(N)
#space complexity -O(N)
#two pointer approach - we take two pointer high and low and if high value is greater than low then we move low pointer. Area is caluculated using minimum of low and high value times the width. 



class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        if height==[] or len(height)==0:
            return 0
        max_area=0
        low=0
        high=len(height)-1
        while low<=high:
            curr_area=min(height[low],height[high])*(high-low)
            max_area=max(max_area,curr_area)
            
            if height[low]<height[high]:
                low=low+1
            
            else:
                high=high-1
        return max_area
            