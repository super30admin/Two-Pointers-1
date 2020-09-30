#O(N) TIME AND O(1) SPACE
class Solution:
    def sortColors(self, nums):
        p1 = 0
        p2 = len(nums) - 1
        i = 0
        while i <= p2:
            num = nums[i]
            if num == 0:
                self.swap(p1,i,nums)
                p1+=1
                i+=1
            elif num == 2:
                self.swap(p2,i,nums)
                p2 -= 1
            else:
                i+=1
        return nums
    
    def swap(self,i,j,array):
        array[i],array[j] = array[j],array[i]