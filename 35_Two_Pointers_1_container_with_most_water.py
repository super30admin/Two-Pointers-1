#Time Complexity : O(n) for n number of elements in an array
#Space Complexity : O(1) Just a constant space
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : 

#Your code here along with comments explaining your approach

class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        left=0
        right=len(height)-1
        max_area=float('-inf')
        area=0
        #Three conditions could be there 
        while left<=right: #breaking condition would be when left>right
            if height[left]<height[right]: #1st condition if left height is smaller than the right height, we will move forward to the right by left++ to get bigger height if possible
                area=(right-left)*height[left] 
                left+=1
            
            elif height[left]==height[right] or height[left]>height[right]: 
                area=(right-left)*height[right] #2nd and 3rd condition, if both left and right height would be the same, I can  go left or right, here we are going to left by right-- and 3rd condition: if left height is greater than the right height we can move toward left by right--
                right-=1
            
            if area>max_area: 
                max_area=area
        return max_area
    
                