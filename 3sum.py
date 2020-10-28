# Time Complexity: O(n log n) + O(n^2) -> O(n^2)
# Space Complexity: O(1), no auxillary space used
# Did it run on Leetcode: Yes
# Approach: 
# Using an approach similar to the two sum problem to find pairs that add up to a target
# The function findPairs uses two pointers and iterates over the array to find two number + a fixed 'first' number that add up to the target
# Call this function for every number in the array
# More comments in-line...

class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        def findPairs(first, target):
            """
            first: A fixed number
            target: The number the triplets must add up to
            This function finds two numbers + 'first' that add up to the target
            """
            start = first + 1
            end = len(nums) - 1
            
            while start < end:
                triplet_sum = nums[first] + nums[start] + nums[end]
                if triplet_sum == target:
                    triplets.append([nums[first], nums[start], nums[end]])
                    start += 1
                    end -= 1
                    # To skip over duplicates, increment start, decremnent end
                    while start < end and nums[start] == nums[start-1]:
                        start += 1
                    while start < end and nums[end] == nums[end+1]:
                        end -= 1
                else:
                    if triplet_sum < target: # Increment the start if sum is lesser than target
                        start += 1
                    else: # decrement end to bring sum down
                        end -= 1
        
        # Edge Cases
        if not nums or len(nums) < 3:
            return []
        if len(nums) == 3:
            return [[nums[0], nums[1], nums[2]]] if sum(nums) == 0 else []
        
        # Array to store results
        triplets = []
        
        # Sort input array
        nums.sort()
        
        for i in range(len(nums)):
            # Skip over duplicates
            if i > 0 and nums[i] == nums[i-1]:
                continue
            findPairs(i, 0)
            
        return triplets