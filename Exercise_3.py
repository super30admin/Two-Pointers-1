#Time Complexity : O(N^2), N being the length of the array. 
#Space Complexity : O(1), because no auxiliary array is created. 
#Did this code successfully run on Leetcode : Yes.
#Any problem you faced while coding this : After completing the problem, I still had
#uncertainty on whether all cases would have been caught. I had to think a little bit 
#more

#Your code here along with comments explaining your approach in three sentences only
'''Using two pointer technique, start with pointers in high and low and increment/decrement. 
While doing so, keep track of a result that keeps track of maximum. 
'''
class Solution:
    def maxArea(self, height: List[int]) -> int:
        result = 0
        low=0
        high = len(height)-1

        while(low<high):
            #current area. 
            area = (high-low)*min(height[low], height[high])
            #keeps track of maximum
            if result<area:
                result = area
            #increment/decrement depending on current heights. 
            if height[low]<height[high]:
                low = low+1
            else:
                high = high-1

        return result
