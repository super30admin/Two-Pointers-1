'''
Time Complexity -->
O(nlogn)+O(n^2)

Space Complexity-->
O(1) constant
'''

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        ls=[]
        res = set()
        nums.sort()
        
        i = 0
        while i<=len(nums)-3:
            j = i+1
            k = len(nums)-1
            while j<k:
                if nums[i]+nums[j]+nums[k]==0:
                    res.add((nums[i], nums[j], nums[k]))
                    j+=1
                    k-=1
                elif nums[i]+nums[j]+nums[k]>0:
                    k-=1
                else:
                    j+=1
            i+=1
        print(res)
        return(res)
        