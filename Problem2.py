# 15. 3Sum
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        n = len(nums)
        result = []

        for i in range(0,n-2):
            if i > 0 and nums[i] == nums[i-1]: continue
            if nums[i] > 0:break

            low = i+1
            high = n-1
            
            while(low<high):
                sum_ = nums[i]+nums[low]+nums[high]

                if sum_ == 0:
                    result.append([nums[i],nums[low],nums[high]])
                    low += 1
                    high -= 1
                    while low < high and nums[low] == nums[low-1]:
                        low += 1
                    while low < high and nums[high] == nums[high+1]:
                        high -= 1

                elif sum_ > 0:
                    high -= 1
                else:
                    low += 1
                
        return result

        

                

        
        