class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:

        res=[]

        if nums is None or len(nums)==0:
            return res

        nums.sort()
        for i in range(len(nums)-2):
            if i>0 and nums[i] == nums[i-1]: #to avoid duplicate triplets
                continue

            low = i+1; high = len(nums)-1
            while low<high:
                summ = nums[i]+nums[low]+nums[high]
                if summ==0:
                    res.append([nums[i],nums[low],nums[high]])
                    low+=1
                    high-=1
                    while (low<high and nums[low]==nums[low-1]):
                        low+=1
                    while(low<high and nums[high]==nums[high+1]):
                        high-=1

                elif summ > 0:
                    high-=1

                else:
                    low+=1

        return res
                
