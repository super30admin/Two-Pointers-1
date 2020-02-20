class ThreeSum(object):
    '''
    Solution:
    1.  Brute force is cubic time and to reduce it to quadratic, sorting the array helps.
    2.  After sorting, maintain an outer pointer, along with two inner pointers for each outer pointer, calculate the sum
        of all three pointer's values and move inner pointers accordingly.
    3.  Append whenever the sum is 0 to the returning list.

    --- Passed all testcases on leetcode successfully

    O(n^2) Time Complexity | O(1) Space Complexity
    '''
    
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """

        if (nums == None or len(nums) < 3):
            return []

        nums.sort()                         # sort to reduce the solution to O(n^2)
        final_list = []

        for i in range(0, len(nums) - 2):
            if (i > 0 and nums[i] == nums[i - 1]):  # if two consecutive numbers in the outer loop are same, skip the second
                continue
            low = i + 1
            high = len(nums) - 1
            while (low < high):
                currentSum = nums[i] + nums[low] + nums[high]

                if (currentSum == 0):                                      # case 1 => add to the list
                    final_list.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -= 1
                    while (low < high and nums[low] == nums[low - 1]):      # first inc low and dec high and then check for duplicates
                        low += 1
                    while (low < high and nums[high] == nums[high + 1]):
                        high -= 1
                elif (currentSum > 0):                                      # case 2 => decrement high
                    high -= 1
                else:                                                       # case 3 => increment low
                    low += 1

        return final_list