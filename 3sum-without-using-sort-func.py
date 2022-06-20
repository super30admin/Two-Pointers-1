class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        result=set()
        for i in range(len(nums)-1):
            dict1=set()
            two_sum=0-nums[i]
            for j in range(i+1,len(nums)):
                rem= two_sum-nums[j]
                if rem in dict1:
                    ans=sorted([nums[i],nums[j],rem])
                    result.add(tuple(ans))
                    
                else:
                    dict1.add(nums[j])
        out=[]            
        for x in result:
            out.append(list(x))
        return out
        