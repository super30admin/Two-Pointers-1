# Time Complexity : Wrtitten below in comments for each of the four approaches
# Space Complexity : Wrtitten below in comments for each of the four approaches 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        ##### Homework Submit hashing and binary search soln as Homework ##########
        
        ############ Approach1: Brute Force, O(n^3) time and O(1) auxiliary space ##################
        # ans = set()
        # for i in range(len(nums)-2):
        #     for j in range(i+1,len(nums)-1):
        #         for k in range(j+1,len(nums)):
        #             if nums[i]+nums[j]+nums[k] == 0:
        #                 triplet = [nums[i],nums[j],nums[k]]
        #                 triplet.sort() #This takes constant time as add has only three elements
        #                 ans.add(tuple(triplet))
        # return ans
        # ###### Approach 2 - Hashing Soln: Apply Two Sum for each i in nums ###########
        # ####### Time Complexity: O(n^2) and Space Complexity: O(n) ##########
        # ans = set()
        # for i in range(len(nums)-2):
        #     target = 0 - nums[i]
        #     # Now we apply two sum for the remaining elements in nums[i+1:] trying to find a pair whose sum is 0-nums[i]
        #     h = {} # Hashmap to store all the elements we have already seen
        #     for j in range(i+1,len(nums)):
        #         complement = target - nums[j]
        #         if complement in h.keys(): # Check if complement is already seen i.e if it is in the keys of the hashmap
        #             triplet = [nums[i],nums[j],complement]
        #             triplet.sort() #This take constant time as add has only three elements
        #             ans.add(tuple(triplet))
        #         h[nums[j]] = j
        # return ans
        
        ####### Approach 3: Sort array and apply twoSum II i.e two pointers solution to each remaning number in sorted nums #########
        ######## Most Optimal for 3 Sum: Time Complexity: O(n^2 + nlogn) = O(n^2) and Space Complexity: O(1) ##########
#         nums.sort() # Sort the given nums array
#         ans = set()
#         for i in range(len(nums)-2):
#             if i!=0 and nums[i] == nums[i-1]:
#                 continue # To avoid duplicates, we skip the current i if it is the same as previous i
#             target = 0 - nums[i]
#             # Now we apply two pointers solution of two sum to the remaining part of nums with a target of 0-nums[i]
#             low = i+1
#             high = len(nums)-1
            
#             while(low < high):
#                 if nums[low]+nums[high] == target:
#                     ans.add((nums[i],nums[low],nums[high])) # The nums array is already sorted, so we need not sort the triplet again
#                     low += 1
#                     high -= 1 # Update both low and high as we already selected them
#                     while(low < high and nums[high] == nums[high+1]):
#                         high -= 1 # Keep decreasing high if it is the same as the previous i.e if its a duplicate
#                     while(low < high and nums[low] == nums[low-1]):
#                         low += 1 # Keep increasing high if it is the same as the previous i.e if its a duplicate
                        
#                 elif nums[low]+nums[high] > target:
#                     high -= 1
                    
#                 else:
#                     low += 1
                    
#         return ans
            
        
        ######## Approach 4 Sorting and Binary Search: Sort nums array and apply twoSum II binary search solution for each remaining number in sorted nums Time Complexity is O(n^2 * log n) which is not the most optimal but better than brute force, Also gets Time Limite Exceeded #######
        
        nums.sort() # Sort the given nums array
        ans = set()
        for i in range(len(nums)-2):
            if i!=0 and nums[i] == nums[i-1]:
                continue # To avoid duplicates, we skip the current i if it is the same as previous i
            for j in range(i+1,len(nums)-1):
                if j!=i+1 and nums[j] == nums[j-1]:
                    continue # To avoid duplicates, we skip the current j if it is the same as previous j
                # Now we search for 0 - nums[i] - nums[j] in the remainder of nums uing binary search
                target = 0 - nums[i] - nums[j]
                low = j+1
                high = len(nums)-1
                
                while(low <= high):
                    mid = low + (high-low)//2
                    if nums[mid] == target:
                        ans.add((nums[i],nums[j],nums[mid]))
                        low += 1
                        high -= 1
                        while(low < high and nums[high] == nums[high+1]):
                            high -= 1 # Keep decreasing high if it is the same as the previous i.e if its a duplicate
                        while(low < high and nums[low] == nums[low-1]):
                            low += 1 # Keep increasing high if it is the same as the previous i.e if its a duplicate
                    elif nums[mid] > target:
                        high -= 1
                    else:
                        low += 1
        return ans