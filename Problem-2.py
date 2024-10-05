#Approach
# sort the given array and maintain the three pointers if i+k > target move left pointer else k
# if i has same elements increase i untill unique elements


#Complexities
# Time Complexity: O(N log(N) + N^2)
# Space Complexity: O(1)



from typing import List


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        result = []
        i = 0
        target = 0
        for i in range(len(nums) - 2):
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            j = i + 1
            k = len(nums) - 1
            while j < k:
                if nums[j] + nums[k] == target - nums[i]:
                    result.append([nums[i], nums[j], nums[k]])
                    while j < k and nums[j] == nums[j + 1]:
                        j += 1
                    while j < k and nums[k] == nums[k - 1]:
                        k -= 1

                    j += 1
                    k -= 1
                elif nums[j] + nums[k] > (target - nums[i]):
                    k -= 1
                else:
                    j += 1
        return result




s = Solution()
print(s.threeSum([-1,0,1,2,-1,-4]))