"""
Use two pointers at both ends, find area using min-height * width (len * breadth)
Move the pointer pointing to the shorter line inside
Keep track of max area through iterations
"""
"""
Time Complexity: O(n) — single pass
Space Complexity: O(1) — constant space
"""

class containerWater:
    def maxArea(self, height: list[int]) -> int:

        left = 0
        right = len(height)-1
        area = 0

        while(left!=right):

            if height[left] < height[right]:
                area = max(area, height[left] * (right-left))
                left=left+1
            else:
                area = max(area, height[right] * (right-left))
                right=right-1

        return area

if __name__=="__main__":
    obj = containerWater()
    height = [1,8,6,2,5,4,8,3,7]
    print(obj.maxArea(height))

     


        
      
