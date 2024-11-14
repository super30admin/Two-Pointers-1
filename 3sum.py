class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        print(nums)
        list1 = []

        for x in range(len(nums)):
            i = x+1
            j= len(nums)-1
            if x>0 and nums[x]==nums[x-1]:
                continue
            while i < j:
                sum = nums[x] + nums[i] + nums[j]
                if sum <0:
                    i = i + 1
                elif sum >0:
                    j = j - 1
                elif (sum==0):
                    list1.append([nums[x],nums[i],nums[j]])
                    i = i + 1
                    while (nums[i]==nums[i-1] and i < j):
                        i = i + 1
        return list1
        

        
        