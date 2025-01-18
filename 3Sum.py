class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        res=[]
        for i in range(len(nums)):
            l=i+1
            h=len(nums)-1
            if i!=0 and nums[i]==nums[i-1]:
                continue
            while l<h:
                if nums[i]+nums[l]+nums[h] ==0:
                    res.append([nums[i],nums[l],nums[h]])
                    l+=1
                    h-=1
                    while l<h and nums[l]==nums[l-1]:
                        l+=1
                    while l<h and nums[h]==nums[h+1]:
                        h-=1
                elif nums[i]+nums[l]+nums[h] < 0:
                    l+=1
                else:
                    h-=1
        return res 

            

        