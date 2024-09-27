#n2,n,hmap
# // Time Complexity :O(n^2)
# // Space Complexity :O(n)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res=[]
        nums=sorted(nums)
        for i in range(len(nums)):
            target=-nums[i]
            if i>0 and nums[i]==nums[i-1]:
                continue
            s=i+1
            e=len(nums)-1
            while s<e:
                
               
                if nums[s]+nums[e]==target:
                    li=[nums[i],nums[s],nums[e]]
                    if sorted(li) not in res:
                        res.append(sorted(li))
                        s+=1
                        e-=1
                    while s<e and nums[s]==nums[s-1]:
                        s+=1
                    while s<e and nums[e]==nums[e+1]:
                        e-=1
                    
                    
                elif nums[s]+nums[e]>target:
                    e-=1
                else:
                    s+=1
                
                
        return res