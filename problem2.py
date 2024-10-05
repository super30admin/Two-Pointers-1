# time complexity: O(n^2)
# space complexity: O(1)

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        n = len(nums)
        nums.sort()

        for i in range(n-2):
            if i>0 and nums[i] == nums[i-1]:
                continue
            if nums[i]>0:
                break
            low = i+1
            high = n-1

            while low<high:
                sum = nums[i] + nums[low] + nums[high]
                
                if sum == 0:
                    result.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -= 1
                    while(low<high and nums[low] == nums[low-1]):
                        low += 1
                    while(low<high and nums[high] == nums[high+1]):
                        high -= 1
                elif sum<0:
                    low += 1
                else:
                    high -= 1
        return result