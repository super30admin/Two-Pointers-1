# TC = O(n)
# SC = O(1)
# Intuition: 1) farther apart the lines more water
# 2) amount of water between 2 lines is limited by the shorter line
# one pass- pointers at each end of the array and contract. The shorter line index of the two will be changes. If equal change any one , NOT BOTH! as lines as much as apart they are- better it is - we may loose one combination if we do. 
def mostWater(heights):
    if not heights and len(heights) == 0: return 0
    max_, low, high = 0,0,len(heights) -1
    while low < high:
        max_ = max(max_, min(heights[low], heights[high])*(high-low))
        if heights[low] <= heights[high]:
            low += 1
        else:
            high -= 1
    
    return max_

heights = [4,3,2,1,4]
print(mostWater(heights))
