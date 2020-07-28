# APPROACH 1: BRUTE FORCE SOLUTION (HASHMAP)
# Time Complexity : O(n), n: length of nums
# Space Complexity : O(1), the number of entries in hashmap is only 3- one for each of the colors, key and value is int
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. Store the count of occurrence of each eleemnt in hashmap
# 2. Now take those counts and place the elemnts accordingly in nums in order - 0, 1, 2

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        hashmap = defaultdict(int)
        for num in nums:
            hashmap[num] += 1

        nums[0 : hashmap[0]] = [0 for _ in range(hashmap[0])]
        nums[hashmap[0] : hashmap[0] + hashmap[1]] = [1 for _ in range(hashmap[1])]
        nums[hashmap[0] + hashmap[1] : len(nums)] = [2 for _ in range(hashmap[2])]




# APPROACH 2 : BRUTE FORCE SOLUTION (FOR LOOPS)
# Time Complexity : O(n^2), n: length of nums
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. For each element (main) of nums, go through rest of the elements (after it) in nums (aux)
# 2. If the aux element is less than main eleemnt, swap them as we need array in ascending order

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        for curr_ind in range(len(nums)):
            for other_ind in range(curr_ind, len(nums)):

                if nums[curr_ind] > nums[other_ind]:
                    nums[curr_ind], nums[other_ind] = nums[other_ind], nums[curr_ind]

                
      
# APPROACH 3: OPTIMAL SOLUTION (TWO POINTERS)
# Time Complexity : O(n), n: length of nums
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. Have 2 pointers - p_0 and p_2 such that elements before p_0 is 0 and eleemnts after p_2 is 2.
# 2. For each element of the nums, -> if 1, simply continue (as we need it to stay in middle
#                                  -> if 2, push it to p_2
#                                  -> if 0, push it to p_0

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        insert_0, insert_2, curr_ptr = 0, len(nums) - 1, 0
        
        while curr_ptr <= insert_2:
            
            if nums[curr_ptr] == 1:
                curr_ptr += 1
                
            elif nums[curr_ptr] == 0:
                nums[insert_0], nums[curr_ptr] = nums[curr_ptr], nums[insert_0]
                insert_0 += 1
                curr_ptr += 1
                
            elif nums[curr_ptr] == 2:
                nums[insert_2], nums[curr_ptr] = nums[curr_ptr], nums[insert_2]
                insert_2 -= 1
                
        
        
