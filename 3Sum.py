"""
Time Complexity: O(n)
Space Complexity: O(1)
"""

class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        nlen = len(nums)
        nums.sort()

        result = []

        for i in range(0, nlen-1, 1):
            if(i > 0 and nums[i] == nums[i-1]):
                continue

            l = i +1
            r = nlen - 1

            while(l < r):
                sum = nums[i] + nums[l] + nums[r]

                if sum == 0:
                    result.append([nums[i], nums[l], nums[r]])
                    l += 1
                    r -= 1

                    while(l < r and nums[l] == nums[l-1]):
                        l += 1
                    while(l < r and nums[r] == nums[r+1]):
                        r -= 1
                elif sum > 0:
                    r -= 1
                else:
                    l += 1

        return result
                    







s = Solution()
print(s.threeSum([-1,0,1,2,-1,-4]))
        