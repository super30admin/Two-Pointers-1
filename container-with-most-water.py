#Time complexity = O(n) accessing each element once
#Space complexity= O(1) no auxillary data structure
#running on leetcode: yes

class Solution():
    def maxArea(self,height):
        
        #sanity check
        if (height == None or len(height)==0):
            return 0
        #store the max area
        maxAr=0
        
        #low and high pointer
        low = 0
        high = len(height)-1 #last element
        
        while (low < high):
            #update variable with max of earlier maxAr and the current area
            #take the min heoght between low and high and the distance between high and low
            #area calculated at every point
            maxAr = max(maxAr,(min(height[low],height[high])*(high - low)))
            
            #increase low if low is min else decrease high
            if (height[low] <= height[high]):
                low += 1
            else:
                high -=1
            
        return maxAr
