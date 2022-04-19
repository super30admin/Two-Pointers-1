#container with most water
# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this :no

      


def maxArea( height):
    low=0
    high= len(height)-1
    maximum=0
    while(low<high):
        maximum = max(maximum, min(height[low], height[high])*(high-low))       #find the area by multiplying the distancebetween two by the minimum of the two height
        if(height[low]>height[high]):                                           #if the height of the low array is less, then increment that one
            high-=1
        else:                                                                   #else, decrement the high one
            low+=1
    return maximum

print(maxArea([1,8,6,2,5,4,8,3,7]))