class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        #sorting the array
        nums.sort()
        for i in range(len(nums)-2):
            #checking condition for positive numbers
            if nums[i] > 0:
                break
            #skipping duplicates
            elif i>0 and nums[i]==nums[i-1]:
                continue
            lo, hi = i + 1, len(nums) - 1
            while (lo < hi):
                #adding 3 numbers
                sum = nums[i] + nums[lo] + nums[hi]
                #condition for sum=0
                if sum == 0:
                    res.append([nums[i], nums[lo], nums[hi]])
                    lo += 1
                    hi -= 1
                    #checking for duplicates
                    while lo<hi and nums[lo]==nums[lo-1]:
                        lo+=1
                    while lo<hi and nums[hi]==nums[hi+1]:
                        hi-=1
                #condition for sum<0
                elif sum < 0:
                    lo += 1
                else:
                    hi -= 1
        return res
                
#Time-Complexity: O(NlogN)
#space-Complexity: O(1)