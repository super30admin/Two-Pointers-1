class SortColors(object):
    '''
    Solution:
    1.  Maintain 3 pointers low, mid and high. low, mid starting at 0 and high starting from the end.
    2. Move over mid and high indices and swap mid with either high or low based on the value at mid index. The main idea is that
        0 is present at low index, 1 at mid index and 2 at high index.
    3. Whenever mid and high cross each other, terminate.

    --- Passed all testcases on leetcode successfully
    # O(n) Time Complexity | O(1) Space Complexity
    '''

    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        if (nums == None or len(nums) == 0):
            return

        low = 0
        mid = 0
        high = len(nums) - 1

        while (mid <= high):                    # we check mid and high and not low as mid incs. always whenever low incs.
            if (nums[mid] == 2):                # case 1
                self.__swap(nums, mid, high)
                high -= 1
            elif (nums[mid] == 1):              # case 2
                mid += 1
            else:                               # case 3
                self.__swap(nums, low, mid)
                mid += 1
                low += 1

        return

    def __swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp