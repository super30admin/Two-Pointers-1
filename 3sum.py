# Time Complexity: O(n*n)
# Space Complexity: O(1)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        # print(nums)
        result=[]
        for i in range(len(nums)-2):
            if i>0 and nums[i]==nums[i-1]: continue
            if nums[i]>0: break
            l=i+1
            r=len(nums)-1
            while l<r:
                cur_sum=nums[i]+nums[l]+nums[r]
                if cur_sum<0:
                    l+=1
                elif cur_sum>0:
                    r-=1
                else:
                    result.append([nums[i],nums[l],nums[r]])
                    l+=1
                    r-=1
                    while l<r and nums[l]==nums[l-1]:
                        l+=1
                    while l<r and nums[r]==nums[r+1]:
                        r-=1 
        return result
                    
            