# Time Complexity : O(N^2) when N is number of elements
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def threeSum(self, nums):
        triplets = []
        if len(nums) == 0: return triplets
        nums.sort()
        n = len(nums)
        for mp in range(n - 2):
            low, high = mp + 1, n - 1
            #Handling outside duplicacy
            if mp > 0 and nums[mp] == nums[mp-1]:
                continue
            while low < high:
                three_sum = nums[mp] + nums[low] + nums[high]
                if three_sum < 0:
                    low += 1
                elif three_sum > 0:
                    high -= 1
                else:
                    triplets.append([nums[mp], nums[low], nums[high]])
                    low += 1
                    high -= 1
                    #Handling inside duplicacy
                    while low < high and nums[low] == nums[low - 1]:
                        low += 1
                    while low < high and nums[high] == nums[high + 1]:
                        high -= 1
               
        return triplets


solution = Solution()
print(f'OUTPUT >> {solution.threeSum([-1,0,1,2,-1,-4])}')