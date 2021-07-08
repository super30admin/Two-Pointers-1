class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        output=[]
        if len(nums)<=2:
            return []
        nums.sort()
        for i in range(len(nums)-2):
            if i>0 and nums[i]==nums[i-1]:
                continue
            start=i+1
            end=len(nums)-1
            
            while(start<end and end<len(nums)):
                
                if (nums[i]+nums[start]+nums[end])==0:
                    output.append([nums[i],nums[start],nums[end]])
                
                    while((start+1)<len(nums) and nums[start]==nums[start+1]):
                        start+=1
                
                    while((end-1)>=0 and (nums[end]==nums[end-1])):
                        end-=1
                    start+=1
                    end-=1
                elif (nums[i]+nums[start]+nums[end])>0:
                    end-=1
                else:
                    start+=1
        return output
    #Time O(n^2)
    #Space O(1)
