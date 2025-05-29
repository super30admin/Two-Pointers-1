'''
Time Complexity: O(N) 
Space Complexity: O(1) 

Approach: We use a two-pointer technique, initializing two pointers, `slow` and `fast`. 
We move `slow` pointer to the first element of the array that is not red, and `fast` pointer to the first element of the array that is red. 
Then, we swap the elements of the array at the positions of `slow` and `fast` pointers. 
Finally, we move `slow` pointer to the next element of the array that is not red, and `fast` pointer to the next element of the array that is red. 
This process is repeated until `fast` pointer reaches the end of the array.

And we repeat the same process for the second color (green).

We don't need to explicitly handle the third color (blue) because it will be in the correct position by default after sorting the first two colors.
'''

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        slow, fast = 0, 0 
        N = len(nums)

        # sorting red in place 
        while fast<N:
            if nums[fast]==0:
                temp = nums[slow]
                nums[slow] = nums[fast]
                nums[fast] = temp 

                slow+=1 
            fast+=1 
        
        slow, fast = slow, slow
        
        while fast<N:
            if nums[fast]==1:
                temp = nums[slow]
                nums[slow] = nums[fast]
                nums[fast] = temp 

                slow+=1 
            fast+=1 




        