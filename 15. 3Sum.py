#brute force - time limit exceeded

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if nums == None or len(nums) == 0:
            return []
        result = []
        hashset = set()
        n = len(nums)
        for i in range(n):
            for j in range(i+1, n):
                for k in range(j+1, n):
                    if (nums[i] + nums[j] + nums[k]) == 0:
                        atuple = tuple(sorted([nums[i],nums[j],nums[k]]))
                        if atuple not in hashset:
                            result.append([nums[i],nums[j],nums[k]])
                            hashset.add(atuple)
        return result


# three pointer approach after sorting the array
# TC O(n^2) and SC O(1)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if nums == None or len(nums) == 0:
            return []
        result = []
        nums.sort() #O(log n)
        for i in range(len(nums)): #(i, low = i+1, high) #O(n)
            if i != 0 and nums[i] == nums[i-1]:
                continue
            if nums[i] > 0:
                break
            low = i+1
            high = len(nums)-1
            while low < high: #O(n)
                triplet = nums[i] + nums[low] + nums[high]
                if triplet == 0:
                    result.append([nums[i],nums[low],nums[high]])
                    low = low + 1
                    high = high - 1
                    while low< high and nums[low] == nums[low - 1]:
                        low = low + 1
                    while low< high and nums[high] == nums[high + 1]:
                        high = high - 1
                elif triplet < 0:
                    low = low + 1
                else:
                    high = high - 1
        return result