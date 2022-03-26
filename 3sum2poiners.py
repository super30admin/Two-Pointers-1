class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result =[]
        if(len(nums)<3 or nums == None): return result
        i=0
        nums.sort() #sorting imp as we are handling duplicasy on sorted list
        print(nums)
        for i in range(len(nums)-2):
            if(i!=0 and nums[i-1]==nums[i]): continue #to handle duplicasy outside 2 pointers
            j=i+1
            k=len(nums)-1
            while(j<k):
                s=nums[i]+nums[j]+nums[k]
                #print(str(s)+str(nums[i])+str(nums[j])+str(nums[k]))
                if(s == 0):
                    result.append([nums[i],nums[j],nums[k]])
                    j+=1
                    k-=1
                    #to handle duplicasy of k and j pointers
                    while(j<k and nums[j]==nums[j-1]):
                        j+=1
                    while(j<k and nums[k]==nums[k+1]):
                        k-=1
                elif(s>0):
                    k-=1
                else:
                    j+=1
                        
                    
        
        #print(result)                       
        return result
                
