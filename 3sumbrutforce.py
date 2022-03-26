class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result =[]
        if(len(nums) < 3): return result
        i=0
        reset=set({})
       
        for i in range(len(nums)-2):
                j=i+1
                for j in range(j,len(nums)-1):
                    k=j+1  
                    for k in range(k,len(nums)):
                        sum=nums[i]+nums[j]+nums[k]
                        if(sum==0):
                            li=sorted((nums[i],nums[j],nums[k]))
                            lis=tuple(li)
                            print(reset)
                            if lis not in reset:
                                reset.add(lis)
                                result.append(list(lis))
                                
        return result
                
