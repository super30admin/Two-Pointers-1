# tc : O(n)
# sc O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        low = 0 
        high = len(height) -1
        max_area = 0
        curr_area = 0
        
        while low < high :
            curr_area = min(height[low], height[high])*(high - low)
            max_area = max(curr_area, max_area)
            
            if height[low] < height[high]:
                low += 1
            elif height[low] == height[high]:
                low +=1
                high -= 1
            else:
                high -= 1
        return max_area