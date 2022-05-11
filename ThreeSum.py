#Time complexity: O(n*n)
#Space complexity: O(1)
class Solution:
    def threeSum(self, nums):
        lst=[]
        nums.sort()
        for i in range(len(nums)):
            if(i>0 and nums[i]==nums[i-1]):
                continue
            left=i+1
            right=len(nums)-1
            while(left<right):
                if(nums[i]+nums[left]+nums[right]==0):
                    lst.append([nums[i],nums[left],nums[right]])
                    left+=1
                    while(left<right and nums[left] == nums[left-1]):
                        left+=1
                elif(nums[i]+nums[left]+nums[right]>0):
                    right-=1
                else:
                    left+=1
        return lst
            
        