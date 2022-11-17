# TC : O(N^2)
# SC : O(N)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        n = len(nums)
        s = []
        for i in range(n):
            if nums[i]> 0:
                break
            l = i + 1
            h = n - 1
            while l < h:
                sum_of_three = nums[i] + nums[l] + nums[h]
                if  sum_of_three == 0:
                    ll = [nums[i], nums[l], nums[h]]
                    if ll not in s:
                        s.append(ll)
                    # print(s)
                    l += 1
                    h -= 1
                    while l < n and nums[l]==nums[l-1]:
                        l += 1
                    while h >=0 and nums[h]==nums[h+1]:
                        h -= 1
                elif sum_of_three < 0:
                    l += 1
                else:
                    h -= 1
        return s
        
                
        