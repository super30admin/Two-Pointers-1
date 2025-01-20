class Solution:
    
    def __init__(self):
        self.numsSorted = None
        self.pairsList = []
    
    def getSolution(self,nums,tgt):
        
        # Sort the nums
        nums.sort()
        self.numsSorted = nums
        print('Sorted nums:\t',self.numsSorted)
        # Iterate the list 
        for i in range(0,len(self.numsSorted)):
            
            currentElement = self.numsSorted[i]
            # We dont want duplicates i.e. [i] != [i-1]
            if currentElement == self.numsSorted[i-1]:
                continue
            
            # Now use 2ptr approach for i+1 index
            lftPtr = i+1
            rtPtr = len(self.numsSorted)-1
            
            
            
            while lftPtr < rtPtr:
                
                if (currentElement + self.numsSorted[rtPtr] + self.numsSorted[lftPtr] == tgt):
                    self.pairsList.append((currentElement,self.numsSorted[lftPtr],self.numsSorted[rtPtr]))
                    lftPtr +=1
                    rtPtr -=1
                    
                    # We dont want duplicates i.e. [i] != [i-1]
                    while lftPtr < rtPtr and self.numsSorted[lftPtr] == self.numsSorted[lftPtr-1]:
                        lftPtr+=1
                        continue
                    while rtPtr > lftPtr and self.numsSorted[rtPtr] == self.numsSorted[rtPtr+1]:
                        rtPtr-=1
                        continue
            
                    
                elif (currentElement + self.numsSorted[rtPtr] + self.numsSorted[lftPtr])<tgt:
                    lftPtr +=1
                
                else:
                    rtPtr -=1
                
                continue
        
        print('Pairs List is:\t',self.pairsList)


sol = Solution()
sol.getSolution([3,0,-2,-1,1,2], 0)
    