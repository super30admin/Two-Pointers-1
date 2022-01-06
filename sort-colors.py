class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        # Optimized - two pointers
        low, mid, high = 0, 0, len(nums)-1
        while mid <= high:
            if nums[mid] == 2:
                nums[mid], nums[high] = nums[high], nums[mid]
                high -= 1
            elif nums[mid] == 0:
                nums[mid], nums[low] = nums[low], nums[mid]
                mid += 1
                low += 1
            else:
                mid += 1
        
        
        # Bruteforce
        # if not nums: return []
        # counter = [0 for i in range(3)]
        # for i in range(len(nums)):
        #     counter[nums[i]] += 1
        # i = 0
        # for j in range(counter[0]):
        #     nums[i] = 0
        #     i+= 1
        # for j in range(counter[1]):
        #     nums[i] = 1
        #     i+= 1
        # for j in range(counter[2]):
        #     nums[i] = 2
        #     i+= 1
