class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        dic = []
        nums.sort()
        for i in range(0,len(nums)):
           
            if i != 0 and nums[i-1] == nums[i]:
                continue
            low = i+1
            high = len(nums)-1
            while(low<high):
                add = nums[i]+nums[low]+nums[high]
                if add ==0:
                    arr = [nums[i],nums[low],nums[high]]
                    arr.sort()
                    if arr not in dic:
                        dic.append(arr)
                    low = low + 1
                    high = high -1
                    while(low < high and nums[low] == nums[low-1]):
                        low = low + 1
                    while(low < high and nums[high] == nums[high + 1]):
                        high = high - 1
                elif add < 0:
                    low = low +1
                else:
                    high = high -1
        return dic
        