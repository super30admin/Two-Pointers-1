class Solution:
    
    def __init__(self):
        self.maxWater = None
        # 2 ptrs
        self.lftPtr  = None
        self.rightPtr = None
        
    def maxArea(self, height: List[int]) -> int:
        
        # Initialize left and right ptr's
        self.lftPtr = 0
        self.rightPtr = len(height)-1
        
        # Iterate the list 
        while (True):
            
            # Break if my lftPtr exceeds rightPtr
            if self.lftPtr >= self.rightPtr:
                break
            
            '''
            print('\nMax Water is:\t',self.maxWater)
            print('Left Ptr is:\t',self.lftPtr)
            print('Right Ptr is:\t',self.rightPtr)
            '''
            
            # Get the distance/width
            width = abs(self.lftPtr-self.rightPtr)
            #print('Width is:\t',width)
            
            # Get the height "h"
            h = min(height[self.lftPtr],height[self.rightPtr])
            #print('Height is:\t',h)
            
            # Cal area
            area = width * h
            #print('Area is:\t',area)
            
            if self.maxWater == None or self.maxWater < area:
                self.maxWater = area
                
            # Now adjust the lowest ptr
            if height[self.lftPtr] <= height[self.rightPtr]:
                # Move the lowest ptr i.e. leftPtr
                self.lftPtr +=1
                continue
            
            else:
                # Move the lowest ptr i.e. rightPtr
                self.rightPtr -=1
                continue
        
        # Return the maxWater
        return self.maxWater