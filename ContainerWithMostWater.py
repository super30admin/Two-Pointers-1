  ---------------------- Max Area_ContainerWithMostWater------------------------------------------------   
# Time Complexity : O(N) N is the length of the nums.
# Space Complexity : O(1) as I am returning the same array used for exploring numbers
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
# Here I used 2 pointer approach, to sort the array and as we have only 3 types of colors, I have a low and high pointer pointing at the end of the array. 
# Calculating the area by taking width as j-i and height as min or height of i and j pointers. 
#As moving forward the width is decreasing , we will keep the maximum height pointer same and move the min height pointer towards other pointer. 
# At each step comparing the area with maxarea gives us the result.



class Solution:
    def maxArea(self, height: List[int]) -> int:
        if not height:
            return 0
        
        i = 0
        j = len(height)-1
        maxarea = 0
        while i<j:
            area = (j-i)*min(height[i], height[j])
            maxarea = max(maxarea, area)
            
            if height[i]<=height[j]:
                i +=1
            else:
                j -=1
        return maxarea