class Solution(object):
    def threeSum(self, nums):
        """
        Sorting the array and using two pointers to find triplets that sum to zero.
        The idea it to perform a fixed iteration for the first element of the triplet 
        and then use two pointers to find the other two elements just like 2 sum problem
        Time complexity: O(n^2) Space complexity: O(k) where k is number of triplets
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        sorted_nums = sorted(nums)
        res = set()
        n = len(sorted_nums)
        for i in range(n):
            left = i + 1
            right = n - 1
            while left < right:
                current_sum = sorted_nums[i] + sorted_nums[left] + sorted_nums[right]
                if current_sum == 0:
                    triplet = (sorted_nums[i], sorted_nums[left], sorted_nums[right])
                    res.add(triplet)
                    left += 1
                    right -= 1
                elif current_sum < 0:
                    left += 1
                else:
                    right -= 1
        
        return [list(t) for t in res]

