class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        ## T.C = O(n)
        ## S.C = O(1)
        
        ar = 0
        low, high = 0, len(height)-1
        
        while low < high:
            ar = max(ar, min(height[low], height[high])*(high-low))
            if height[low] < height[high]:
                low += 1
            else:
                high -= 1
        
        return ar