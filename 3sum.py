#Time Complexity : O(n)
#Space Complexity: O(1)

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []

        nums.sort()
        
        n = len(nums)
        for i in range(n-2):
            if i >0 and nums[i] == nums[i-1]: continue
            l = i+1
            r = n-1
        
            while l < r:
                sumN = nums[i] + nums[l] + nums[r]
                if sumN == 0:
                    res.append([nums[i], nums[l], nums[r]])
                    l+=1
                    r-=1
                    while l < r and nums[l-1] == nums[l]:
                        l+=1
                    while l<r and nums[r+1] == nums[r]:
                        r-=1
                elif sumN > 0:
                    r-=1
                else:
                    l+=1
        return res


                
                