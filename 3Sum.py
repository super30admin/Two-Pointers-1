# time complexity is o(n²), where n is the size of the input
# space complexity is o(1)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = list()
        if(not len(nums)):
            return res
        nums.sort()
        for i in range(len(nums)):
            if(i > 0 and nums[i] == nums[i - 1]):
                continue
            if(nums[i] > 0):
                break
            low = i + 1
            high = len(nums) - 1
            while(low < high):
                sums = nums[i] + nums[low] + nums[high]
                if(sums == 0):
                    res.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -=1
                    while(low < high and nums[low-1] == nums[low]):
                        low += 1
                    while(low < high and nums[high+1] == nums[high]):
                        high -= 1
                elif(sums < 0):
                    low += 1
                else:
                    high -= 1
        return res
            
        
        
        