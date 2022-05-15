'''
Time Complexity: O(N^2), where N is the length of list nums
Space Complexity: O(1)
Executed Successfully: Yes
Challenges Faced: No
'''

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        if nums == [] or len(nums) == 0:
            return []
        res = list()
        nums.sort()
        for i in range(len(nums)-2):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            if nums[i] > 0:
                break
            l,r = i+1,len(nums)-1
            while l < r:
                curr = nums[i] + nums[l] + nums[r]
                if curr == 0:
                    res.append([nums[i],nums[l],nums[r]])
                    l += 1
                    r -= 1
                    
                    while l < r and nums[l] == nums[l-1]:
                        l += 1
                    while l < r and nums[r] == nums[r+1]:
                        r -= 1
                elif curr < 0:
                    l += 1
                else:
                    r -= 1
        return res
                    
                
        