# To solve this problem, I assign 2 pointers to the array one at start and one at end, now I check which is minimum and calculate area, if end is minimum then shift start by one else decrement end by 1.
# Time Complexity: O(n)
#Spce complexit: O(1)
def maxArea(height):
    if (height is None or len(height)==0):
        return 0
    maxArea = 0
    low = 0
    high = len(height)-1
    while(low<high):
        if (height[low] < height[high]):
            maxArea = max(maxArea,height[low]*(high-low))
            low = low + 1
        else:
            maxArea = max(maxArea,height[high]*(high-low))
            high =high - 1
    return maxArea

arr = [1,1]
ar = maxArea(arr)
print(ar)