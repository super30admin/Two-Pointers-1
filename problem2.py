
#time - O(n**2) sorting wont effect the overall complexity 
#space - o(1)

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        #sort the list
        nums=sorted(nums)
        ans=[]
        for i in range(0,len(nums)):
            if nums[i]>0:
                break
            elif i==0 or nums[i-1]!=nums[i]:
                self.findsum(nums,ans,i)
        return ans
    def findsum(self,nums,ans,i):
        l=i+1
        h=len(nums)-1
        while l<h:
    
            sum1=nums[i]+nums[h]+nums[l]
            if sum1==0:
                ans.append([nums[i],nums[l],nums[h]])
                h=h-1
                l=l+1
                while l < h and nums[l] == nums[l - 1]:
                    l += 1
            elif sum1>0:
                h=h-1
            else:
                l=l+1
        
        
        
            
            
        
