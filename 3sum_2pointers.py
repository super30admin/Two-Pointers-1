class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        :space complexity: O(1)
        :time complexity: O(n^2)
        """
        result=[]
        nums.sort()
        
        for i, num in enumerate(nums):
            # to check if we have visited the value before
            if i>0 and num==nums[i-1]:
                continue
            
            l,r = i+1, len(nums) -1
            while l<r:
                three_sum=num + nums[l] + nums[r]
                # move right
                if three_sum >0:
                    r-=1
                # move left
                elif three_sum<0:
                    l+=1
                else:
                    result.append([num, nums[l],nums[r]])
                    l+=1
                    while nums[l]==nums[l-1] and l<r:
                        l+=1
        return result