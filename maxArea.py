#Time Complexity : O(n) at every index their is the movement of left pointer or right pointer
#Space Complexity : O(1) result is return in form of an integer
class Solution:
    def maxArea(self, height: List[int]) -> int:
        ht= len(height)
        #storing the size of array
        maximum = 0
        #defining low and height pointers 
        low = 0 
        high = ht-1
        #defining while loop for getting the highest area
        while(low<high):
            #calculating the maximum area possible between the the heights 
            #area = minimum height of the low and high * the minimum length of the height from high and low
            maximum = max(maximum, min(height[low], height[high])*(high -low))
            if(height[low] < height[high]):
                low +=1
            else:
                high -= 1
        return maximum
