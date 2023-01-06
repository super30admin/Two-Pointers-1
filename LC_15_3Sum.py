SC-> O(N)
TC->O(1)

class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """

        nums = sorted(nums)
        print(nums)
        result = []
        for i in range(len(nums)-2):
            low = i+1
            high = len(nums)-1
            #checking for outer duplicay
            if i > 0 and nums[i] == nums[i-1]:continue      
            if nums[i] > 0:
                break #since it is sorted if we find number greater than 0, there is no way to find a triplet

            while(low<high):
                summ = nums[i]+nums[low]+nums[high]
                if summ == 0:
                    result.append([nums[i],nums[low],nums[high]])
                    low = low + 1
                    high = high - 1
                    #internal duplicacy, continue to search for triplet after finding one
                    while((low < high) and (nums[low]==nums[low-1])):
                        low = low + 1
                    while((low < high) and (nums[high]==nums[high+1])):
                        high = high-1
                elif summ > 0:
                    high = high-1
                else:
                    low = low + 1
            
        return result