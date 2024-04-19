# // Time Complexity : O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode : yes   
# // Any problem you faced while coding this : no


# // Your code here along with comments explaining your approach

# take 2 pointers on frist and last element 
# if the lowest height is on left , move left pointer to center 
# if lowest height is on right move pointer from right to center 
# calucalte curr arr = high -low * min (height[low], height[right]) 



class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len( height)
        result = 0

        low , high = 0 , n-1

        while (low <= high ):
            width = high - low
            curArr = 0

            if height[low] < height[high] :
                curArr = width * height[low]
                low += 1
            else: 
                curArr = width * height[high]
                high -= 1
            result = max(result, curArr)
        return result