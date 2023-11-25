class Solution:
    def two_sum(self,nums,target_sum):
        # print(nums,end=" ")
        # print(target_sum)
        res=[]
        dic1={}
        for i in range(0,len(nums)):
            if nums[i] not in dic1:
                dic1[nums[i]]=i
            else:
                dic1[nums[i]]=i
        
        # print(dic1)
        
        for i in range(0,len(nums)):
            lis=[]
            if target_sum-nums[i] in dic1 and i!=dic1[target_sum-nums[i]]:
                lis.append(nums[i])
                lis.append(target_sum-nums[i])
            lis.sort()
            if lis not in res and len(lis)==2:
                res.append(lis)
        print(res)
        return res

    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res=[]
        
        for i in range(0,len(nums)):
            two= self.two_sum(nums[i+1:],(0-nums[i]))
            if len(two)>0:
                for j in range(0,len(two)):
                    # print(two[i])
                    two[j].append(nums[i])
                    # print(two[j])
                    two[j].sort()
                    if two[j] not in res:
                        res.append(two[j])

        print(res)
        return res


        

        