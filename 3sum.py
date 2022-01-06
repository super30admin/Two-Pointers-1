# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        # Optimized - using two pointers
        nums.sort()
        n = len(nums)
        result = []
        for i in range(len(nums)-2):
            if i!=0 and nums[i] == nums[i-1]: continue
            low = i+1
            high = n-1
            while low < high:
                sum = nums[i] + nums[low] + nums[high]
                if sum == 0:
                    result.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -= 1
                    while low < high and nums[low] == nums[low-1]:
                        low += 1
                    while low < high and nums[low] == nums[high+1]:
                        high -= 1
                elif sum < 0:
                    low += 1
                else:
                    high -= 1
        return result
                    
        
        # if not nums or len(nums) < 3:
        #     return []
        # result = []
        # hashmap = {}
        # for i in range(len(nums)):
        #     val1 = nums[i]
        #     for val in range(i, len(nums)):
        #         if hashmap.has_key((-1*nums[val])-val1):
        #             result.append([nums[i], nums[val], (-1*nums[val])-val1])
        #             hashmap.pop((-1*nums[val])-val1)
        #         else:
        #             hashmap[nums[val]] = val
        # return (result)