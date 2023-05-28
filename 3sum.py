#TC: O(n^2)
#SC: O(1)

class Solution(object):    
    def threeSum(self, nums):

        if (nums == None or len(nums) < 3):
            return []

        nums.sort()              
        final_list = []

        for i in range(0, len(nums) - 2):
            if (i > 0 and nums[i] == nums[i - 1]): 
                continue
            low = i + 1
            high = len(nums) - 1
            while (low < high):
                currentSum = nums[i] + nums[low] + nums[high]

                if (currentSum == 0):                       
                    final_list.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -= 1
                    while (low < high and nums[low] == nums[low - 1]):      
                        low += 1
                    while (low < high and nums[high] == nums[high + 1]):
                        high -= 1
                elif (currentSum > 0):                                      
                    high -= 1
                else:                                                      
                    low += 1

        return final_list