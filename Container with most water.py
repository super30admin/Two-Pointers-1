#Time Complexity : O(n)

#Space Complexity : O(1) 

#Did this code successfully run on Leetcode : Yes

#Any problem you faced while coding this :None

# =============================================================================
#Solution: Take 2 pointers low at 0 index and high at last index.
#Width will decrease by 1 unit at each step either you increment your low pointer or decrement high pointer. Hence our condition is based on height.
#Will keep the higher height and move our pointers based on the lower height. And maxi variable to hold the max area.
# =============================================================================


class Solution:
    def maxArea(self, height: List[int]) -> int:
        high = len(height)-1
        low = maxi= 0
        while(low < high):
            area = (high - low) * min(height[low], height[high])
            maxi = max(maxi,area)
            if height[low] < height[high]:
                low += 1
            else:
                high -= 1
        return maxi
        