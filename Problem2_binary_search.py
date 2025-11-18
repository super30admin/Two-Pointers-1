class Solution(object):
    def threeSum(self, nums):
        """
        Performing binary search to find triplets that sum to zero.
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
            for j in range(i+1, n):
                target = -(sorted_nums[i] + sorted_nums[j])
                left = j + 1
                right = n - 1
                while left <= right:
                    mid = left + (right - left) // 2
                    if sorted_nums[mid] == target:
                        triplet = (sorted_nums[i], sorted_nums[j], sorted_nums[mid])
                        res.add(triplet)
                        break
                    elif sorted_nums[mid] < target:
                        left = mid + 1
                    else:
                        right = mid - 1
        
        return [list(t) for t in res]

