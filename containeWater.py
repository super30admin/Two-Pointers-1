# Author: Naveen US
# Titile: Container With Most Water.

# Time complexity: O(n)
# Space complexity: O(1)
# Did the code run on leetcode: Yes

# 2 pointers high, low are used to find the maximum area.
# we update the pointers until the high pointer is higher than the lower pointer.

def maxArea(self, height: List[int]) -> int:
    low=0
    high=len(height)-1
    max_area=0
    while(low<high):
        max_area =max(max_area, min(height[low],height[high])*(high-low)) 
        if height[low]>height[high]:
            high=high-1
        else:
            low=low+1
    return max_area
