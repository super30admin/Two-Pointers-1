# problem 2 

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        n = len(nums)
        final_arr = []
        for i in range(n):
            if i != 0 and nums[i] == nums[i-1]:
                continue
            if nums[i] > 0:
                break
            low = i+1
            high = n-1
            while low < high:
                total = nums[i]+nums[low]+nums[high]
                if total == 0:
                    final_arr.append([nums[i],nums[low],nums[high]])
                    low+=1
                    high-=1
                    while low < high and nums[low-1] == nums[low]:
                        low+=1
                    while low < high and nums[high] == nums[high+1]:
                        high-=1
                elif total > 0:
                    high -=1
                else:
                    low +=1
        return final_arr