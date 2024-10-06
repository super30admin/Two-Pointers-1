# Time Complexity : O(n) is the number of elements in height, due to a single pass with two pointers.
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : N/A

# Your code here along with comments explaining your approach 

class Solution:
    def maxArea(self, height: List[int]) -> int:
        #Assign the required variables
        n=len(height)
        maximum = 0
        low = 0
        high = n-1
        #Iterate until low=high, i.e by that time it reaches highest volume
        while(low<=high):
            h=0
            w=high-low
            #The pointer with lower height can only form a container
            if(height[low]<height[high]):
                h=height[low]
                low+=1
            else:
                h=height[high]
                high-=1
            #Calculate max with existing value and the current value
            maximum=max(maximum,h*w)
        return maximum

            
