#Time Complexity --> O(n)
#Space Complexity --> O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        low = 0
        high = n-1
        result = 0
        while low<high:
            if height[low]<height[high]:
                result = max(result, (high-low)*height[low])
                low = low+1
            else:
                result = max(result, (high-low)*height[high])
                high = high-1
        return result 

'''
#Time Complexity --> O(n^2)
#Space Complexity --> O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        result = 0
        for i in range(n):
            for j in range(i+1, n):
                result = max(result, (j-i)*min(height[i], height[j]))
        return result 
'''
