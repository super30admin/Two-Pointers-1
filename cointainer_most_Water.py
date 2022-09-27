#time complexity:o(n), 1 pass 
#space complexity: o(1) , only storing area and left and right ptrs
#passed all cases on LeetCode: yes
#difficulty faced: -
# comments: in the code
#https://leetcode.com/problems/container-with-most-water

class Solution:
    def maxArea(self, height: 'List[int]') -> int:
        
        ar = float('-inf')
        
        lptr,rptr  = 0, len(height)-1
        
        while (lptr < rptr):
            
            #water held is constrained by which height is lesser
            ht1 = min(height[lptr],height[rptr])
            ar = max(ar, ht1*(rptr-lptr) )
            
            #we move the pointer with lesser height bec we want the max area, since width is going to dec for sure
            #moving the one which is lesser gives a better shot at maximizing the area
            if height[lptr] <= height[rptr]:
                lptr += 1
            else:
                rptr -= 1
                
        return ar
            
        