#Brute force solution

class Solution:
    def maxArea(self, height: List[int]) -> int:
        vol = 0
        for i in range(len(height)-1):
            for j in range(1, len(height)):
                vol = max(vol, (min(height[i],height[j]) *(j-i) ))
        
        return vol
    
#time copmlexity is O(n^2)
#space complexity is O(1)


#Two pointer solution

class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxArea = 0
        low = 0
        high = len(height)-1
        
        while low < high:
            area = (min(height[low], height[high])*(high-low))
            maxArea = max(maxArea, area)
            if height[low] < height[high]:
                low += 1
            else:
                high -= 1
        
        return (maxArea)
        
    
#time copmlexity is O(n) where n is the number of elements in the list
#space complexity is O(1)
# 2 pointer approach is used where the pointer with lesser value is moved towards a higher value index