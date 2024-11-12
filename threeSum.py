# // Time Complexity :O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :Yes 
# // Any problem you faced while coding this : Was trying to fit in 2sum hashmap logic here. 
# all 4 bounday conditions.
# 1)no duplicates, 2) if target is l <= 0 
# 3 and 4)duplicates inbound

# // Your code here along with comments explaining your approach
# also can use hmap to improve runtiime?

class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        
        n = len(nums)
        nums = sorted(nums)
        result = []
        
        for i in range(n):
            l = i+1
            r = n-1
            if i > 0 and nums[i] == nums[i-1]: continue     # 1) for same i's dont do 2sum again
            if nums[i] > 0: break                           # for sum greater than 0 dont need to check for values above 0
            while l<r:
                aSum = (nums[i] +nums[l] +nums[r])          # target
                if aSum == 0:                               # output condition
                    result.append((nums[i],nums[l],nums[r]))# add to result    
                    l+=1
                    r-=1
                    while l<r and nums[l] == nums[l-1]:     # if duplicates and not out of bounds
                        l+=1
                    while l<r and nums[r] == nums[r+1]:     # if duplicates and not out of bounds
                        r-=1
                elif aSum < 0:
                    l+=1
                else:
                    r-=1
        return result
                
                        

