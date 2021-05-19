class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        '''
        TC : O(n^2)
        SC : O(1)
        Approach :
        sort the list
        travrse through the entire list and for current element as target and 
            apply two sum to find the answer.
        
        '''
        n = len(nums)
        nums.sort()
        res = []
        if n < 3: return []
        for i in range(n-2):
            if i != 0 and nums[i] == nums[i-1]:
                continue
            low = i + 1
            high = n - 1
            while low < high:
                s = nums[i] + nums[low] + nums[high]
                if s == 0:
                    res.append([nums[i],nums[low],nums[high]])
                    low += 1
                    high -= 1
                    while low < high and nums[low] == nums[low-1] : low += 1
                    while low < high and nums[high] == nums[high+1] : high -= 1
                elif s >0 :
                    high -=1
                else:
                    low += 1
        return res
            
        