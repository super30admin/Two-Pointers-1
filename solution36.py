#Time Complexity:O(n)
#Space Complexity:O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        m=0                                                             #initializing max to 0
        low=0                                                           # initializing low poiner and high pointers
        high=len(height)-1
        while(low<high):                                                #while low pointer is before high pointer
            m=max([m,(min([height[low],height[high]])*(high-low))])     #update max with either current max or new area between current low and high pointers
            if(height[low]<height[high]):                               #if value at low pointer is lower than value at high pointer
                low+=1                                                  #increment low pointer
            else:                                                       #else decrement high pointer
                high-=1
        return m                                                        #return max value