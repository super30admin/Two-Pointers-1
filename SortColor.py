#Time Complexity : O(n)

#Space Complexity : O(1) 

#Did this code successfully run on Leetcode : Yes

#Any problem you faced while coding this :None

# =============================================================================
# Solution: Take 3 pointers i,curr and k. i to keep track of all 0's before it k to keep track of all 2's after it and other is pointing to current.
#Since kis keeping track of 2 if 2 reaces at position then decrement k. i is keeping track of 0 and i and current both poitning to 0th index 
#intialiaaly so increment iboth i and curr if 0 is found and if 1 is found increment current.
# =============================================================================


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        i = 0
        curr =0
        k = len(nums)-1
        while(curr <= k):
            if nums[curr] == 2:
                temp = nums[curr]
                nums[curr] = nums[k]
                nums[k] = temp 
                k -= 1
            elif nums[curr] == 0:
                temp = nums[curr]
                nums[curr] = nums[i]
                nums[i] = temp
                i += 1
                curr +=1
            else:
                curr += 1
        
                
        
        