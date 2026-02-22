# Problem 3

class Solution:
    def maxArea(self, height: List[int]) -> int:
        left_ptr,right_ptr = 0,len(height)-1
        curr_max = 0 
        while(left_ptr!=right_ptr):
            if height[left_ptr] > height[right_ptr]:
                curr_area = height[right_ptr] * (right_ptr-left_ptr) 
                right_ptr -=1 
            else:
                curr_area = height[left_ptr] * (right_ptr-left_ptr) 
                left_ptr +=1 
            curr_max = max(curr_area,curr_max)
        return curr_max