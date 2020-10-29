"""
Time complexity =O(N^2)  ie[O(N logN)+O(N^2)]
Space complexity =O(1)

Have l pointer as i+1 and r pointer at the last index .
check nums[i]+nums[l]+nums[r]==0 or lt or gt 0 and move pointer accordingly 
Duplicates are eliminated because i,l and r pointer always move to next unique number.
"""


class Solution_3sum:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if len(nums)==0 or nums is None:
            return []
        res=[]
        n = len(nums)
        nums.sort()
        print(nums)
        for i in range(n-2):
            if i>0 and nums[i]==nums[i-1]:
                continue
            l=i+1
            r=n-1
            
            while l<r:
                sum1=nums[i]+nums[l]+nums[r]
                if sum1<0:
                    l=l+1
                
                elif sum1>0:
                    r=r-1
                
                else: 
                    res.append([nums[i],nums[l],nums[r]])
                    
                    while l<r and nums[l]==nums[l+1]:
                        l = l+1
                    while l<r and nums[r]==nums[r-1]:
                        r = r-1
                    
                    l = l+1
                    r = r-1
            
        return res    
            
        