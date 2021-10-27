class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
      # TC===>O(n^2)
      # SC===>O(n)
        lis=[]
        nums.sort()
        # print(nums)
        for i in range(len(nums)-1):
            low=i+1
            high=len(nums)-1
            while(low < high):
                sum=nums[i]+nums[low]+nums[high]
                if sum==0:
                    lis.append([nums[i],nums[low],nums[high]])
                if sum > 0:
                    high=high-1
                else:
                    low=low+1
        res=[]
        for sublist in lis:
            if sublist not in res:
                res.append(sublist)
        return(res)
        