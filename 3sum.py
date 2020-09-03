"""
448. Find All Numbers Disappeared in an Array

Time = O(nlogn+n^2) = O(n^2); nlogn for sorting; n = number elements in array
space = O(1); constant space
Successfully excecuted on leetcode


Approach - 
Binary Search
1. sort the array to reduce the search space, iterate through element in array
2. Assign left and right pointer, update pointers at each step to find target sum

"""

class Sum:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        n = len(nums)
        answer = []
        for i in range(n):
            if i>0 and nums[i] == nums[i-1]:
                continue
            target= nums[i]*-1
            left = i+1
            right = n-1
            while left<right:
                if nums[left]+nums[right] == target:
                    answer.append([nums[i],nums[left],nums[right]])
                    left += 1
                    while left<right and nums[left] == nums[left-1]:
                        left += 1
                elif nums[left]+nums[right] < c:
                    left += 1
                else:
                    right -= 1
        return answer

