# Time Complexity : O(n)
# Space Complexity : O(1) or constant auxiliary space complexity
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # ###### Using Hashmap, O(n) time with TWO passes and O(1) space since hashmap only has 3 keys and we can consider that as constant auxiliary space ########
        # if len(nums) < 2 or not nums:
        #     return
        # h = {0:0,1:0,2:0} # Initialize a hashmap with keys as 0, 1 and 2 with value 0 (i.e count = 0)
        # for i in range(len(nums)):
        #     h[nums[i]] += 1 # Add count of 0,1 or 2 into the hashmap
        # # print(h)
        # idx = 0 # Initialize a variable idx to traveserse through nums and update its values
        # for key in h.keys(): # Let key represent each of the keys in h
        #     for i in range(h[key]): # For how many ever times key occurs, update nums[idx] to the key
        #         nums[idx] = key
        #         idx += 1
        
        
        ############# Two (actually three) pointers solution: O(n) time with ONE pass and O(1) or constant space ####################
        low = 0
        high = len(nums)-1
        
        curr = 0
        
        while curr <= high:
            if nums[curr] == 0:
                # If curr element is 0, swap low element with curr
                nums[curr], nums[low] = nums[low], nums[curr]
                # Increment low and curr
                low += 1
                curr += 1 # We move curr also along with low, we need not touch the previous low element as it is guarenteed to have 0 there, so we just move both low and curr to the next element
                # If we don't move curr to the next element we will be stuck in an infinite loop if curr and low were both 0 to begin with. Curr should always be ahead of low or at the same element as 
            elif nums[curr] == 2:
                # If curr element is 2, then swap curr element with high
                nums[curr], nums[high] = nums[high], nums[curr]
                high -= 1 # Decrement high as now 2 is agt current high and we need not swap it again, so we reduce high by 1
                # We do not change curr as the value att changed
            else:
                curr += 1
                # Just move curr to the next element