"""
// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

"""


class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        
        ar=0
        
        i=0
        j=len(height)-1
        while i<j:
            l=j-i #width of the container will be the difference between the 2 pointers 
            b=min(height[i],height[j]) #and height will be constrained by the min of the two heights
            if ar<l*b: #compare the previous area with current area, if current is greater then update
                ar=l*b
            if (height[i]<height[j]): #we update the pointer for the height which is smaller
                i=i+1
            else:
                j=j-1