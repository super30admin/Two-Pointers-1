""" 
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : yes
Approach: Here, we have to sort the colors without using any other space that means we have to do it in-place for this, we can have an i pointer which will iterate 
through the nums array and other pointer will be at the end of the array, at each i pointer we  will make sure if the number at i pointer is less than our other pinter
then we will swap both the elements and we will keep decremnt our second pointer till we reaches to our i pointer, for that we will use for loop till the length of 
the nums and will use while loop for second pointer till both the pointer indices are same. and the end we will retirn the whole nums.

"""

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        for i in range(len(nums)):
            h = len(nums) - 1
            while(i<=h):
                if nums[i] > nums[h]:
                    nums[i], nums[h] = nums[h], nums[i]
                # print(nums)
                h -= 1
            
        return nums
