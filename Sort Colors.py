'''
Time Complexity: O(N), where N is the length of list nums
Space Complexity: O(1)
Executed Successfully: Yes
Challenges Faced: No
'''

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums == [] or len(nums) == 0:
            return
        
        l,m,h = 0,0,len(nums)-1
        while m <= h:
            if nums[m] == 0:
                self.swap(nums,m,l)
                l += 1
                m += 1
            elif nums[m] == 1:
                m += 1
            else:
                self.swap(nums,h,m)
                h -= 1
    
    def swap(self,nums,i,j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp