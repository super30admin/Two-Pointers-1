class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        def findPairs(first, target):
            start = first + 1
            end = len(nums) - 1
            
            while start < end:
                triplet_sum = nums[first] + nums[start] + nums[end]
                if triplet_sum == target:
                    
                    triplets.append([nums[first], nums[start], nums[end]])
                    start += 1
                    end -= 1
                    while start < end and nums[start] == nums[start-1]:
                        start += 1
                    while start < end and nums[end] == nums[end+1]:
                        end -= 1
                else:
                    if triplet_sum < target:
                        start += 1
                    else:
                        end -= 1
        
        if not nums or len(nums) < 3:
            return []
        if len(nums) == 3:
            return [[nums[0], nums[1], nums[2]]] if sum(nums) == 0 else []
        
        triplets = []
        nums.sort()
        
        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            findPairs(i, 0)
            
        return triplets