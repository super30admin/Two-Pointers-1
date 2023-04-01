# Time Complexity = O(n)
# Space Complexity = O(n)

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        size = len(nums)
        cnt_arr = [0] * 3
        temp = [0] * size
        print(temp)
              
        for i in range(0,size):
            cnt_arr[nums[i]] += 1
        print(cnt_arr)
        for i in range(1,3):
            cnt_arr[i] += cnt_arr[i-1]
        print(cnt_arr)
        i = size - 1
        while i >= 0:           
            temp[cnt_arr[nums[i]] - 1] = nums[i]
            cnt_arr[nums[i]] -= 1
            print(temp[i])
            i -= 1
        for i in range(0, size):
            nums[i] =temp[i]
