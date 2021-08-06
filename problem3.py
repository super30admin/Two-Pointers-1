#container with most water
#time complexity: big O(n)
#space complexity:O(1)
#leet code solutionaccepted

class Solution:
    def maxArea(self, height: List[int]) -> int:
        res = 0 #init res variable
        l = 0#leftpointer
        r = len(height)-1#rightpointer
        while l<r:#run the loop 
            area = (r-l)*min(height[l],height[r])#area is len and breath of a rectangle so here the r-l is the width while the height is goign to be whatever is the min
            res = max(res,area)
            
            if height[l]<height[r]:#condition 1 with l<r then increase left
                l+=1
            else:# there are two conditions within this case if l>r and if height[l] and height[r] are equal
                r-=1
        return res
        