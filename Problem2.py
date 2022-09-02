class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        

        nums.sort()
        res = set()
        dict1 = {}

        for i in range(0,len(nums)):
            dict1[nums[i]] = i


        for i in range(len(nums)):

            if i>0 and nums[i]==nums[i-1]:
                continue

            sum1 = -nums[i]

            for j in range(i+1, len(nums)):


                req = sum1-nums[j]


                if req in dict1 and dict1[req]>j:
                    temp = (-sum1,nums[j],req)
                    
                    
                    res.add(temp)
        
        
        return res
