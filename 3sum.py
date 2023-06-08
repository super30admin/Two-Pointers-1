# Time Complexity :O(n**2log(n))
# Space Complexity :O(1)
# Leet Code: Yes

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        triplets = []
        nums.sort()
        
        for i in range(len(nums) - 2):
            # break after the value once the sorted value exceeds the target.
            if nums[i] > 0:
                break
            # no need of storing the result of hashset, keep moving the pointer untill duplicate values found
            if i > 0 and nums[i] == nums[i-1]:
                continue
            l = i+1
            r = len(nums) - 1
            while l<r:
                if nums[l] + nums[r] + nums[i] < 0:
                    l += 1
                elif nums[l] + nums[r] + nums[i] > 0:
                    r -= 1
                else: # no need of storing the result of hashset, keep moving the pointer untill duplicate values found
                    triplets.append([nums[i], nums[l], nums[r]])
                    l += 1
                    r -= 1
                    while nums[l] == nums[l-1] and l<r:
                        l += 1
                    while nums[r] == nums[r+1] and l<r:
                        r -= 1

        return triplets