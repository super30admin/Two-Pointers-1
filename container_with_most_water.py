
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach
The area of the container is the area of distance between x-coordinates multiplied with the minimum of the y-coordinates(heights).we then check which is larger and then we move towards that side.and we store the maximum of all the iterations present.maxi gives the maximum possible area.


class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        maxi=0
        i=0
        j=len(height)-1
        while(i<j):
            maxi=max(maxi,(j-i)*min(height[i],height[j]))
            if height[i]<height[j]:
                i=i+1
            else:
                j=j-1
        return maxi