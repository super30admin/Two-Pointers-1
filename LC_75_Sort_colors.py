

#TC->O(n)
#SC-> 0(1)
class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """

        # if len(nums)<3:
        #     return -1

        low = 0
        mid = 0
        high = len(nums)-1

        while(mid<=high):
            if nums[mid]==2:
               self.__swap(mid,high,nums)
               high = high-1
            elif nums[mid] == 0:
                self.__swap(mid,low,nums)
                low = low + 1
                mid = mid+1
            else:
                mid = mid + 1
        return nums

    def __swap(self,i,j,nums):
        
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
        return nums