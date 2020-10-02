class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        
        if nums == None or len(nums)<3:
            return []
        arr = []
        nums = sorted(nums)
        for i in range(0,len(nums)-2):
            if (i>0 and nums[i]==nums[i-1]):
                continue
            left = i+1
            right = len(nums)-1
            while(left<right):
                s = nums[i] + nums[left] + nums[right]
                if s==0:
                    arr.append((nums[i],nums[left],nums[right]))
                    left+=1
                    right-=1
                    # while(left<right and (nums[left]==nums[left-1])):
                    #         left+=1
                    # while(left<right and (nums[right]==nums[right+1])):
                    #         right-=1
                elif s<0:
                    left+=1
                else:
                    right-=1
        return set(arr)
                            
                        
        