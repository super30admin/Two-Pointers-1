class Solution:
    def maxArea(self, height: List[int]) -> int:
        """
        Time Complexity: O(n)
        Space Complexity: O(1)
        Did this code successfully run on Leetcode: Yes 

        Any problem you faced while coding this: No
        Your code here along with comments explaining your approach:
        The approach: 
            - we use two pointer approach here
            - first pointer at beginning of the array and last pointer at the end of the array
            - we take initial area value as '-inf'
            - while pointer 1 < pointer 2 
                - we compare element at pointer 1 to the element at pointer 2 
                    we take the smaller of two numbers and multiply it with different between index 
                    of pointer 1 and pointer 2. that will give us the area. we compare current area
                    with the max area and select the maximum 
                    -we increase p1 by 1 (if p1 is less than p2)
                    -we decrease p2 by 1 (if p2 is less than p1)
            - we return the max area
        """        
        n = len(height)
        p1 = 0
        p2 = n-1 
        area = float('-inf')
        while (p1 < p2):
            if height[p1] < height[p2]:
                area = max(area, height[p1] * (p2 - p1))
                p1 +=1 
            else:
                area = max(area, height[p2] * (p2 - p1))
                p2 -=1 
        return area
