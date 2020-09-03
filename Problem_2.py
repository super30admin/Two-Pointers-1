# 15. 3Sum

# Code:

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if not nums:
            return []
        
        # sorting in O(nlogn)
        nums.sort()
        
        res = []
        
        for i in range(len(nums)-2):
            # skip duplicates
            if i!=0 and nums[i]==nums[i-1]:
                continue
            l = i+1
            r = len(nums)-1
            
            while l<r:
                curr_sum = nums[i] + nums[l] + nums[r]
                # Sum==0 found, adding it to result
                if curr_sum == 0:
                    res.append([nums[i],nums[l],nums[r]])
                    
                    # skip duplicates
                    while l<r and nums[l]==nums[l+1]:
                        l+=1
                    while l<r and nums[r]==nums[r-1]:
                        r-=1
        
                    l+=1
                    r-=1
                # sum less than 0, increment left
                elif curr_sum<0:
                    l+=1
                # sum greater than 0, increment right
                else:
                    r-=1
                    
        return res

# Time Complexity: O(NlogN)
# Space Complexity: O(N)
# Accepted on Leetcode: YES
# Any problems faced: No.    
