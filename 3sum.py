#TC: O(n^2)
#SC: O(1)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums=sorted(nums)
        n=len(nums)
        ans=[]
        for i in range(n):
            if i>0 and nums[i]==nums[i-1]: continue
            if nums[i]>0: break
            target=-nums[i]
            j,k=i+1,n-1
            while j<k:
                if nums[j]+nums[k]==target:
                    ans.append((nums[i],nums[j],nums[k]))
                    j+=1; k-=1
                    while j<k and nums[j]==nums[j-1] and nums[k]==nums[k+1]: j+=1; k-=1
                elif nums[j]+nums[k]<target:
                    j+=1
                else:
                    k-=1
        return ans