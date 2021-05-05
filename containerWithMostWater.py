# brute force
class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        maximum =0
        
        for i in range(0,len(height)):
            for j in range((len(height))):
                
                capacity = min(height[i],height[j]) * (abs(j-i))
                if capacity>maximum:
                    maximum = capacity
        return maximum

# two pointer
class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        maximum = 0
        
        left, right = 0, len(height)-1
        
        while right>left:
            maximum = max(maximum, (right-left)*min(height[left],height[right]))
            
            if height[right]>height[left]:
                left+=1
            else:
                right-=1
        
        return maximum
            
    
#  approach is to use two pointers and move the pointer depending on which height is more.
#  time complexity is O(n)
