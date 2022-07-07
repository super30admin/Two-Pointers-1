from pip import List
#Time Complexity = O(n^2)
#Space Complexity = O(1)

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if(len(nums)==0):
            return []
        nums.sort()
        list1 = []
        for i in range(len(nums)):
            if(i>0 and nums[i]==nums[i-1]):
                continue
            left = i+1
            right = len(nums)-1
            sum = 0
            while(left<right):
                sum = nums[i]+nums[left]+nums[right]
                if(sum==0):
                    list1.append([nums[i],nums[left],nums[right]])
                    left+=1
                    right-=1
                    while(left<right and nums[left]==nums[left-1]):
                        left +=1
                    while(left<right and nums[right]==nums[right+1]):
                        right-=1                            
                elif(sum<0):
                    left+=1
                else:
                    right-=1
        return list1
                    
            
            
            
        