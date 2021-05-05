#Running Time Complexity: O(n)
#Space Time Complexity: Constant or O(1)
#Sucessfully Run and Compiled on leetcode
class Solution:
    def maxArea(self, height: List[int]) -> int:
        if height==None or len(height)<2:
            return None
        if len(height)==2:
            return min(height[0],height[1])
        low = 0
        high = len(height)-1
        ma = 0
        while low<=high:
            ma = max(ma, min(height[low],height[high]) * (high-low))
            if height[low]<=height[high]:
                low +=1
            else:
                high -=1
        return ma