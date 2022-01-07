#tc O(n^2)
#sc O(1)
def target_sum(nums, target):
    low = 0 
    high = len(nums) - 1
    results = []
    while(low < high):
        tsum = nums[low] + nums[high]
        if tsum == target:
            results.append( [nums[low], nums[high]] )
            low += 1
            high -= 1
        elif tsum > target:
            low += 1
        else:
            high -= 1
    return results        
    

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        ans = []
        for i in range(len(nums)):
            ele = -1*(nums[i])
            res = target_sum(nums, ele)
            if len(res) == 0:
                continue
            else:
                for arr in res:
                    arr.insert(nums[i],0)
                    ans.append(arr)
        return ans            
        