# Time Complexity : O(n^2)
# Space Complexity: O(1)
# Works on leetcode: yes
# Approach: We sort the array to easyily traverse the array and adjust left and right pointers. We start left from i+1 as
# previous numbers has already been tried. We take total, if the sum is 0, we got one set, if sum <0, we need left to move
# to right else right to left. 
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        res = []
        for i in range(len(nums)-2):
            if i>0 and nums[i]==nums[i-1]:
                continue
            l,r = i+1, len(nums)-1
            while l<r:
                summ = nums[i]+nums[l]+nums[r]
                if summ>0:
                    r-=1
                elif summ<0:
                    l+=1
                else:
                    res.append([nums[i], nums[l], nums[r]])
                    while (l<r and nums[l]==nums[l+1]):
                        l+=1
                    while (l<r and nums[r]==nums[r-1]):
                        r -=1
                    l+=1
                    r-=1
                
        return res