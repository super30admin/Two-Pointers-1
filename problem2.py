class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        outlist = []
        for i in range(len(nums)):
            if i == 0 or nums[i]!=nums[i-1]:
                self.sumtwo(nums,i,outlist)
        return outlist
    def sumtwo(self,nums,i,outlist):
        j = i+1
        hashset = set()
        while(j<len(nums)):
            compliment = -nums[i]-nums[j]
            if compliment in hashset:
                outlist.append([nums[i],nums[j],compliment])
                while(j+1<len(nums) and nums[j]==nums[j+1]):
                    j = j + 1
            hashset.add(nums[j])
            j = j + 1


        
