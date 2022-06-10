#Time O(n3) solution
#Space O(1)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res=[]
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                for k in range(j+1,len(nums)):
                    if nums[i]+nums[j]+nums[k]==0:
                        l=sorted([nums[i],nums[j],nums[k]])
                        if l not in res:
                            res.append(l)
        return res

#Time O(n2) solution
#Space O(1)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums=sorted(nums)
        res=[]
        for i in range(len(nums)):
            if i>0 and nums[i]==nums[i-1]:
                continue
            if nums[i]>0:
                break
            left=i+1
            right=len(nums)-1
            while left<right:
                if nums[i]+nums[left]+nums[right]==0:
                    res.append([nums[i],nums[left],nums[right]])
                    left+=1
                    right-=1
                    while nums[left]==nums[left-1] and left<right:
                        left+=1
                    while nums[right]==nums[right+1] and left<right:
                        right-=1
                elif nums[i]+nums[left]+nums[right]>0 and left<right:
                    right-=1
                else:
                    left+=1
        return res