#Time Compelxity is: O(n)
#Space Complexity is: O(1)
#Program ran successfully on leet code
#No problem faced while writing the code

#Container with most water
class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        #Initializing the variables
        left=0
        maxi=0
        right=len(height)-1
        while(left<right):
            #Finding and updating the maximum value
            maxi=max(maxi,min(height[left],height[right])*(right-left))
            #We will be adjusting the left and right pointers based on the values at that index
            if(height[left]<height[right]):
                left+=1
            else:
                right-=1
        #returning the maximum value
        return maxi