#efficient two pointer
#time comp- O(n)
#space comp-O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        max_area=0
        s=0
        e=len(height)-1
        while s<e:
            curr_area=min(height[e],height[s])*(e-s)
            if curr_area>max_area:
                    max_area=curr_area
            if height[e]>height[s]:
                s=s+1
            else:
                e=e-1
        return max_area
