# Problem: Container With Most Water
#time: O(n)
#space: O(1)
#explaination: we have 2 pointers l and r. l is at the start of the array and r is at the end of the array. we iterate through the array and find the max area. 
#we do this by finding the min of the 2 elements and multiplying it by the distance between them. we then check if the left element is less than the right element.
# if it is we increment l else we decrement r. we do this until l is less than r.
class Solution:
    def maxArea(self, height: List[int]) -> int:
        l ,r = 0 , len(height)-1
        res = 0

        while l < r:
            res = max(res, min(height[l],height[r])*(r-l))
            if height[l] < height[r]:
                l+=1
            elif height[l]>= height[r]:
                 r-=1
        return res