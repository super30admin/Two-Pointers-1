class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        res = []
        for i in range(len(nums) - 2):
            low = i + 1
            high = len(nums) - 1
            # Ignore if current i is same as previous i
            if i>0 and nums[i] == nums[i-1]:
                    continue
            # Since array is sorted if we can exit if we reach a number greater than 0
            if nums[i] > 0:
                    break
                    
            while low < high:
                # If sum is less than 0 move low ahead
                # If sum is more than 0 move high behind
                # If sum is 0, append it to res
                s = nums[i] + nums[low] + nums[high]
                
                if s == 0:
                    if [nums[i], nums[low], nums[high]] not in res:
                        res.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -= 1
                    # Handling repetitive values
                    while nums[low] == nums[low-1] and low<high:
                        low += 1
                    while nums[high] == nums[high+1] and low<high:
                        high -= 1
                        
                elif s < 0:
                    low += 1
                else:
                    high -= 1
        return res