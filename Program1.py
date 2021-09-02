#Time complexity - O(N)
#Space complexity - O(1)
#Did this run in leetcode - yes

class Solution:
    def maxArea(self, height: List[int]) -> int:
        area = 0
        maximum = 0
        i = 0 
        j = len(height)-1
        
        while(i<j):
            min_height = min(height[i], height[j])
            width = j - i
            area = min_height * width
            maximum = max(maximum, area)
            
            if(height[i] < height[j]):
                i += 1
            else:
                j -= 1
        return maximum