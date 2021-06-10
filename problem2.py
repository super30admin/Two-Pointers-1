class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if not nums or len(nums)<3: return []
        
        result =[]
        nums = sorted(nums)
        n = len(nums)
        for i in range(n):
            if (i !=0 and nums[i] == nums[i-1]): continue
            low = i+1
            high = n-1
            
            while low < high:
                if (nums[i] + nums[low] + nums[high]) == 0:
                    result.append([nums[i], nums[low], nums[high]])
                    low +=1
                    high -=1
                    while low < high and nums[low] == nums[low-1]: low +=1
                    while low < high and nums[high] == nums[high+1]: high -=1
                elif (nums[i] + nums[low] + nums[high]) < 0:
                    low += 1
                else:
                    high -= 1
        
        return result

    
# Time complexity is O(n^2) where O(n) is for initial iteration of i and another O(n) iteration for two pointer sum
# Space complexiy O(1)