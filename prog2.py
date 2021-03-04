class Solution(object):
    def threeSum(self, nums):
        nums.sort()
        result = set()
        for i in range (0,len(nums)-2):
            if (i > 0 and nums[i] == nums[i-1]):
                continue
            low = i+1
            high = len(nums)-1
            while(low < high):
                sum = nums[i] + nums[low] + nums[high]
                if sum == 0:
                    mylist = []
                    mylist.extend((nums[i], nums[low], nums[high]))
                    mylist.sort()
                    result.add(tuple(mylist))
                    del mylist
                    low = low + 1
                    high = high - 1
                    while(low< high and nums[low] == nums[low-1]):
                        low = low + 1
                    while (low < high and nums[high] == nums[high+1]):
                        high = high - 1
                elif sum < 0:
                    low = low + 1
                    #while (low < high and nums[low] == nums[low-1]):
                     #   low = low + 1
                else:
                    if sum > 0:
                        high = high - 1
                        #while (low < high and nums[high] == nums[high+1]):
                        #    high = high - 1

        return list(result)
        
       #time = O(n^2)
       #space = O(1)
                
                
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        