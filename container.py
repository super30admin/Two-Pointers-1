 # Time Complexity : O(N)
# Space Complexity : O{1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
 
 
 
#Set 2 pointers low and high to the start and end of the array respectively
#Create a res variable to store the max area. 
#If the height[low] < height[high] then increment low and if height[high]<height[low] then decrement high
#At each step , calculate the area and comapre with max area stored
 def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        res=0
        l=0
        h=len(height)-1

        while (l<h):
            area= (h-l) * min(height[l],height[h])
            if (height[l]<=height[h]):
                l+=1
            else:
                h-=1 
            if area > res:
                res = area

        return res