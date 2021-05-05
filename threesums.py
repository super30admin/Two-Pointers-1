"""3 sums
Time Complexity - O(n^2)
Space Complexity - O(1) """

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res =[]
        nums.sort()
        
        for i,a in enumerate(nums):
            if i>0 and a ==nums[i-1]:
                continue
            
            l,r  = i+1,len(nums)-1
            while l<r :
                threesums = a + nums[l] +nums[r]
                if threesums > 0:
                    r -=1
                elif threesums <0:
                    l+=1
                else:
                    res.append([a,nums[l],nums[r]])
                    l +=1
                    while nums[l] ==nums[l-1] and l<r:
                        l+=1
        return res
                        