class Solution:
    # leetcode URL : https://leetcode.com/problems/3sum/
    # Problem : 15. 3Sum
    # Time Complexity : O(n^2)
    # Space Complexity : O(1)
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        fp = 1
        ep = len(nums) - 1
        ret_list = set(list())
        nums.sort()
        print(nums)
        for i in range(0,len(nums)):
            fp = i+1
            ep = len(nums) - 1
            while fp<ep:
                if nums[i]+nums[fp]+nums[ep] == 0:
                    ret_list.add((nums[i],nums[fp],nums[ep]))
                    fp = fp+1 
                if nums[i]+nums[fp]+nums[ep]<0:
                    fp = fp+1
                else:
                    ep = ep-1
        return ret_list