class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        tup = []
        nums.sort()
        for i, num in enumerate(nums): 
            start,end = i+1,len(nums) - 1
            if i > 0 and nums[i] == nums[i-1]:
                continue
                
            while start < end:
                # print("main:", num, "start:",nums[start],"end:",nums[end])
                sum_ = nums[start] + num + nums[end]
                if sum_ < 0:
                    start += 1
                elif sum_ > 0:
                    end -= 1
                else:
                    tup.append([nums[start] , num , nums[end]])
                    start += 1
                    while start < end and nums[start] == nums[start - 1]:
                        start += 1
            
        return tup
        