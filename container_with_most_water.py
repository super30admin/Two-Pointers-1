'''
Brute Force: Nested loop, explore all the N^2 options. 
Optimal: 2 pointers
Area = width * height.  here height = min(left_wall_height, right_wall_height)
Since, when we move a pointer, width is reducing. So lets, say we have walls [1,8], 
then area = (8-1) * min(1,8). So if I fix the pointer which is at 1, then no matter what
are will always reduce because there can be two possiblities both giving lesser area:
    1. we get height>1 , then still min(1,larger_height) = 1 
    2. we get height<1, then min(1,smaller height) = smaller height. Area further reduced
Hence the intuition: Move the pointer which is at lowwer height, in hope of finding a bigger wall
so that we have more area.
Time Complexity: O(N), Linear scan
Space Complexity: O(1), Only integer variables
'''
class Solution:
    def maxArea(self, height: List[int]) -> int:
        max_area = -1 #to keep a track of area
        left_wall = 0
        right_wall = len(height)-1

        while left_wall<=right_wall:
            curr_area = (right_wall-left_wall)*min(height[left_wall],height[right_wall]) 
            max_area = max(max_area,curr_area) 
            
            # move the wall which is shorter height. if equal, we rull left_wall to move
            if height[left_wall]<=height[right_wall]:
                left_wall+=1
            else:
                right_wall-=1
        
        return max_area