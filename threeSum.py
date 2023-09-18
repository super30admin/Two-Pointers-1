class Solution:
    def threeSum(self, nums):
        res = []
        n = sorted(nums)
        print(n)
        for i in range(len(n)):
            if n[i] > 0:
                break
            if i == 0 or n[i - 1] != n[i]:
                l = i + 1
                r = len(n) -1
                while l < r:
                    sum = n[i]+n[l]+n[r]
                    if sum < 0:
                        l += 1
                    elif sum > 0:
                        r -= 1
                    else:
                        res.append([n[i],n[l],n[r]])
                        l += 1
                        r -= 1
                        while l < r and n[l] == n[l - 1]: # currunt value = prev_value not do anything just move pointer
                            l += 1
        return res
#TC: O(n**2)
#SC: O(1)