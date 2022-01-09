# Using Two Pointers without Hashset
#TimeComplexity:O(n)
#SpaceComplexity:O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :No
#Used Two Pointers approach to solve the problem
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        numset = set()
        map = {}
        target = 0
        nums.sort()
        # print(nums)
        output = []
        for a in range(0,len(nums)):
            # print(a)
            if(a !=0 and nums[a]==nums[a-1]):
                continue
            
            reqnum = target - nums[a]
            print("outer",a)
            print("outer nums",nums[a])
            low = a+1
            high = len(nums)-1
            # nums.sort()
            while(low<high):
                # print(low,high)
                # print("reqnum",reqnum)
                # print("add",nums[low]+nums[high])
                if(nums[low]+nums[high] > reqnum):
                    high -=1
                elif(nums[low] + nums[high] < reqnum):
                    low +=1
                else:
                    print("reqnum",reqnum,"lowi",low, "lowNo" , nums[low], "highi",high,"highno",nums[high])
                   
                    ele = [nums[low],nums[high],nums[a]]
                    print(ele)
                    output.append(ele)        
                    low+=1
                    high-=1
                    while(nums[low] == nums[low+1] and low < high):
                        low +=1
                    
                    while(nums[high] == nums[high+1] and low < high):
                        
                        high -=1
                            
        print(output)
                        
        
      
        
#         newlist = list(numset)
        
        
#         for a in newlist:
#             output.append(list(a))
#         return output
        
           
      
                        
                    
                
            
        