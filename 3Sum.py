'''
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
Approach 1: Brute Force TC O(n^3)
In this, to avoid duplicate triplets in the result - use sort on the resulting triplet 
and then add it to the set()

Approach 2: HashMap
Fix outside element and find 2Sum on rest of array - using hashmap
x+y+z =0
y+z=-x
N iterations for outside and N for 2Sum - so total is N^2 solution O(n^2)
Space is O(n)

Approach 3: Two Pointers - best - over HashMap and Binary Search
Sort Array : O(nlogn) + O(n^2)
Space: O(1)
Then use 2 pointers solution
To remove internal duplicacy in 2Sum , as soon as you find 1st pair of 2Sum, 
Keep moving both pointers until you find unique elements  
Outside duplicacy can be handled by moving outer pointer forward one step 
at a time until a new element is found. Remember to break out of loop
when nums[i] is >0 because after that point there are no more negative elements
as we sorted the array so we can't find any combination of 3Sum =0.

Approach 4: Binary Search TC O(n^2 log n) SC O(1)
Fix one of the elements and for rest of the elements do 2Sum using binary search
provided the array is/should be sorted.
'''


class Solution:
    def threeSum(self, nums):
        # Brute force approach
        # Gives time limit exceeded as expected
        result = set()
        for i in range(len(nums)-2):
            for j in range(i+1,len(nums)-1):
                for k in range(j+1,len(nums)):
                    if nums[i] + nums[j] + nums[k] == 0:
                        result.add(tuple(sorted([
                            nums[i], nums[j], nums[k]
                        ])))
        
        return [list(r) for r in result]

check = Solution()
print(check.threeSum([-1,0,1,2,-1,-4]))


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # 1 + 2Sum with HashMap
        result = set()
        nums = sorted(nums) # sort the array
        print(nums)
        for i in range(len(nums)-1):
            target = - nums[i]
            m = set()
            for j in range(i+1,len(nums)):
                if target - nums[j] not in m:
                    m.add(nums[j])
                else:
                    result.add(tuple(sorted((nums[i], nums[j], (target-nums[j])))))
        return list(result)

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        '''Approach 3: Two Pointers - best - over HashMap and Binary Search
            Sort Array : O(nlogn) + O(n^2)
            Space: O(1)
            Then use 2 pointers solution
            To remove internal duplicacy in 2Sum , as soon as you find 1st pair of 2Sum, 
            Keep moving both pointers until you find unique elements  
            Outside duplicacy can be handled by moving outer pointer forward one step 
            at a time until a new element is found. Remember to break out of loop
            when nums[i] is >0 because after that point there are no more negative elements
            as we sorted the array so we can't find any combination of 3Sum =0.
        '''
        nums = sorted(nums)
        result = list()
        for i in range(len(nums)-2):
             # while nums[i-1] and nums[i] is same, keep moving i forward
            # to avoid duplicate results - it will cause duplicate in the 1st index of tuple otherwise
            # like this: 
            # [[-1,-1,2],[-1,0,1],[-1,0,1]]
            if i > 0 and nums[i-1] == nums[i]: continue
            # if num[i] >0 then low and high pointers can't give me any <0 nums
            # hence sum will never be 0, so break the loop
            if  nums[i] > 0 : break
           

            low = i+1
            high = len(nums) -1
            while low < high:
                ssum = nums [i] + nums[low] + nums[high]
                if ssum == 0:
                    result.append([nums[i], nums[low], nums[high]])                    
                    low +=1
                    high -=1
                    # remove interal duplicacy
                    while low < high and nums[low-1] == nums[low] and low<high: low +=1
                    while low < high and nums[high+1] == nums[high] and low<high: high -=1
                    
                elif ssum < 0:
                    low +=1
                else:
                    high -=1
        return result