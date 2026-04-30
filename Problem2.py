# Time Complexity --> O(n^2)
# Space Complexity --> O(1)
# Approach --> Traverse over the list for i and look out for the remaining 2 values using pointers. Since the list is sorted, based on the total sum of values we can move the low and high pointers accordingly
class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        nums.sort()
        n = len(nums)
        result = []

        for i in range(n):
            low = i+1
            high = n-1
            if i!=0 and nums[i]==nums[i-1]:
                continue
            while low<high:
                target = nums[i]+nums[low]+nums[high]
                if target==0:
                    result.append([nums[i], nums[low], nums[high]])
                    low = low+1
                    high = high-1
                    while low<high and nums[low]==nums[low-1]:
                        low = low+1
                    while low<high and nums[high]==nums[high+1]:
                        high = high-1
                elif target>0:
                    high = high - 1
                else:
                    low = low+1
        return result


'''
# Time Complexity --> O(n^2logn)
# Space Complxity --> O(1) 
class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        
        def helper(arr, low, high, target):
            while low<=high:
                mid = low + (high-low)//2
                if arr[mid]==target:
                    return mid
                elif arr[mid]>target:
                    high = high-1
                else:
                    low = low+1
            return -1

        n = len(nums)
        re = []
        target = 0
        nums.sort()

        for i in range(len(nums)):
            innertarget = target-nums[i]
            if i!=0 and nums[i]==nums[i-1]:
                continue
            for j in range(i+1,len(nums)):
                if j!=i+1 and nums[j]==nums[j-1]:
                    continue
                t = innertarget-nums[j]
                idx = helper(nums, j+1, n-1, t)
                
                if idx!=-1:
                    triplet = tuple(sorted([nums[i], nums[j], nums[idx]]))
                    re.append(triplet)

        return re
'''

'''
# Time Complexity --> O(n^3)
# Space Complxity --> O(m) where m is the number of unique triplets
class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        
        re = set()
        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                for k in range(j+1, len(nums)):
                    if nums[i]+nums[j]+nums[k]==0:
                        triplet = tuple(sorted([nums[i],nums[j],nums[k]]))
                        re.add(triplet)
        
        return [list(i) for i in re]

'''
