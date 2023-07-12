#TC:O(n^2)
#SC:O(n)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()
        sumi = 0 
        for i,a in enumerate(nums): 
            if i>0 and a==nums[i-1]:
                continue
            l = i+1
            r = len(nums) - 1
            while l<r:
                sumi = a + nums[l] + nums[r]
                if sumi>0:
                    r-=1
                elif sumi<0:
                    l+=1
                else:
                    res.append([nums[l],nums[r],a])
                    l+=1
                    while nums[l]==nums[l-1] and l<r:
                        l+=1
                    
        return res



            
        