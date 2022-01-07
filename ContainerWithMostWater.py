
#Brute force solution
# // Time Complexity : O(N^2)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :


# // Your code here along with comments explaining your approach

class Solution:
    def maxArea(self, height: List[int]) -> int:
        if height == None or len(height) == 0:
            return 0
        maximum = 0
        for i in range(len(height)):
            for j in range (i+1,len(height)):
                maximum = max(maximum, min(height[i],height[j])*(j-i))
                
        return maximum



# Two Pointer Solution

# // Time Complexity : O(N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :


# // Your code here along with comments explaining your approach


class Solution:
    def maxArea(self, height: List[int]) -> int:
        if height == None or len(height) == 0:
            return 0
        maximum = 0
        low = 0
        high = len(height) -1
        while(low< high):
            maximum = max(maximum, min(height[low],height[high])*(high-low))
            if(height[low]<height[high]):
                low += 1
            else:
                high -= 1
        
        return maximum


