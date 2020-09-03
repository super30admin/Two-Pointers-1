"""
11. Container With Most Water

Time = O(n), n = number of elements in array
Space = constant = O(1)
Successfully excecuted on leetcode

Approach --
1. Set two pointers at first and last elemets in array
2. To find out height of the target area take minimum of left and right pointer
3. Store difference between two pointers as width
4. Multiply width and height to get area at each step; update and return max area

"""

class Container:
    def maxArea(self, height: List[int]) -> int:
        #two pointer : Time = O(n), space = O(1)

        left = 0
        right = len(height)-1
        maxarea = 0
        
        while left<right:
            h = min(height[left],height[right])
            w = right-left
            #print("h",h,"w",w)
            area = h*w
            
            maxarea = max(area,maxarea)
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return maxarea
        
        