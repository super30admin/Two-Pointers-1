class Solution:
    
    def getSolution(self,nums):
        
        '''
        lftPtr --> 0
        rtPtr --> 2
        midPtr --> 1
        '''
        
        lftPtr = 0
        rtPtr = len(nums)-1
        midPtr = lftPtr
        
        while midPtr <= rtPtr:
            
            if nums[midPtr] == 2:
                # Swap with rtPtr
                nums[rtPtr], nums[midPtr] = nums[midPtr], nums[rtPtr]
                rtPtr -=1
            
            elif nums[midPtr] == 0:
                # Swap with lftPtr
                nums[lftPtr], nums[midPtr] = nums[midPtr], nums[lftPtr]
                lftPtr +=1
                midPtr +=1
                
            elif nums[midPtr] == 1:
                # Do nothing
                midPtr+=1
        
            continue
        
        print('Updated nums is:\t',nums)

sol = Solution()
sol.getSolution([2,0,2,1,1,0])
sol.getSolution([1,0,2])