class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        #2 sum for each element
        res = set()
        nums.sort() #-4, -1, -1, 0, 1, 2

        for i, num in enumerate(nums):
            #two sum for num
            hashmap = {}
            target = -1*num #bc we want sum to be 0
            
            for j in range(i+1, len(nums)):
                if target - nums[j] in hashmap: # and hashmap[target-nums[j]]!= j:
                    res.add(tuple([num, nums[j], target-nums[j]]))
            
                hashmap[nums[j]]=j
        return [list(r) for r in res]


