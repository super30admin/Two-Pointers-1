class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # dic = Counter(nums)
        # count = 0
        # for i in range(3):
        #     for j in range(dic[i]):
        #         nums[count] = i
        #         count += 1
        
        left, mid, right = 0, 0, len(nums) - 1 

        while mid <= right:
            if nums[mid] == 2:
                nums[mid], nums[right] = nums[right], nums[mid]
                right = right - 1
            elif nums[mid] == 0:
                nums[mid], nums[left] = nums[left], nums[mid]
                left = left + 1
                mid = mid + 1
            else:
                mid = mid + 1
       
