# O(N) TIME AND O(1) SPACE
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        left = 0
        right = len(nums)-1
        i = 0
        while i <= right:
            if nums[i] == 0:
                self.swap(left,i,nums)
                left += 1
                i+=1
            elif nums[i] == 2:
                self.swap(right,i,nums)
                right -= 1
            else:
                i += 1
            
    def swap(self,i,j,array):
        array[i],array[j] = array[j],array[i]
        