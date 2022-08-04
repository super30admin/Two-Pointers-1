# Time complexity : O (n^2 * log n)
# Space complexity : O(1)
# Leetcode : Time limit exceeded

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # Binary search solution
        n = len(nums)
        seen = set()
        res = []
        
        # sort the array which will be in O(nlogn)
        nums.sort()
        
        # traverse the array, for each element, we will calculate the complement, and search using the binary search
        for i in range(n-2):
            for j in range(i+1,n-1):
                low = j+1
                high = n-1
                target = 0 - (nums[i]+nums[j])
                
                # starting the binary search and add the triplets if sum is 0 and also not found in the set and return the final result
                while low <=high:
                    mid = low + (high - low) //2
                    if nums[mid] == target:
                        temp = [nums[i],nums[j],nums[mid]]
                        low += 1
                        high -= 1
                        if temp not in res:
                            res.append(temp)
                    elif nums[mid] > target:
                        high = mid - 1
                    else:
                        low = mid + 1
        return res
