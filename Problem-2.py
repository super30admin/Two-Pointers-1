class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if not nums or len(nums)<3:
            return []
        output=[]
        nums.sort()
        print(nums)
        for i in range(len(nums)-2):
            if i!=0 and nums[i]==nums[i-1]:
                continue
                
            left=i+1
            right=len(nums)-1
            while left<right:
                summ=nums[i]+nums[left]+nums[right]
                if summ==0:
                    output.append([nums[i],nums[left],nums[right]])
                    left+=1
                    right-=1
                    while left<right and nums[left]==nums[left-1]:
                        left+=1
                    while left<right and nums[right+1]==nums[right]:
                        right-=1
            
                elif summ<0:
                    left+=1
                    while left<right and nums[left]==nums[left-1]:
                        left+=1
                
                else:
                    right-=1
                    while left<right and nums[right]==nums[right+1]:
                        right-=1
        return output
                        
                    
                    