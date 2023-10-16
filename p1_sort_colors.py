class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Time Complexity: O(n)
        Space Complexity: O(1)
        Did this code successfully run on Leetcode: Yes 

        Any problem you faced while coding this: No
        Your code here along with comments explaining your approach:
        The approach: 
            - Here, we took 3 pointers -> low, mid, high
            - we check the element at mid pointer all the time 
                - if number at mid == 0 then swap it with number at low pointer
                    and increase mid by 1 and low by 1 
                - if number at mid == 2 then swap it with number at high pointer 
                    and decrease high by 1
                - else (num at mid ==1 )
                    increase mid by 1
        """        
        n = len(nums)
        low = 0 
        mid = 0
        high = n - 1

        while (mid <= high):
            if nums[mid] == 0:
                self.swap(nums, mid, low)
                mid += 1
                low += 1
            elif nums[mid] == 2:
                self.swap(nums, mid, high)
                high -= 1
            else:
                mid += 1
    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp