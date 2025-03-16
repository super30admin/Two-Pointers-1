# Time Complexity:O(n)
# Space Complexity:O(1)
# 2 pointers : l1 and l2
# smaller one is the l and distance between 2 is breadth
#  calculate area
#  is it greater or smaller than the current area? 
# if greater add to  max area.
#  max area is the final answer
# width = r - l
def maxArea(self, height: List[int]) -> int:
    
    max_area = 0
    l = 0
    r = len(height)-1

    while (r>l):
        length = min(height[l],height[r])
        width = abs(l-r)
        curr_area = length * width
        max_area = max(curr_area, max_area)
        if height[l]<height[r]:
            l+=1
        else:
            r-=1
    return max_area