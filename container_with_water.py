import sys
def maxArea(heights) -> int:
    left = 0
    right = len(heights)-1
    maxArea = -sys.maxsize-1
    while (left < right):
        area = min(heights[left], heights[right]) * (right - left)
        maxArea = max(maxArea, area)
        if heights[left] < heights[right]:
           left+=1
        else:
           right-=1

    print(maxArea)    

if __name__ == "__main__":
    heights = [1,8,6,2,5,4,8,3,7]
    maxArea(heights)