#timecomplexity=O(n)
#spacecomplexity=O(1)
#desc l at 0 location and h at last
#area will be difference bw l and h and*(multiply)  minimum height at index l and h 
# if the height[l] is < height[h] increase l++ else h--
#condition l<h becouse we cannot calculate area at same index(dont make any sense) 
class Solution:
    def maxArea(self, height: List[int]) -> int:
        if height==[] or len(height)==0: return []
        maxArea=0
        l=0
        h=len(height)-1
        while l<h:
            maxArea=max(maxArea,(h-l)*min(height[l],height[h]))
            if height[l]<height[h]:
                l+=1
            else:
                h-=1
        return maxArea
            
        