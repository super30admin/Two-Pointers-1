class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        #         lis=[]
        #         for i in range(len(nums)-2):
        #             for j in range(i+1,len(nums)-1):
        #                 for k in range(j+1,len(nums)):
        #                     if nums[i]+nums[j]+nums[k]==0:
        #                         s=sorted([nums[i],nums[j],nums[k]])
        #                         if s not in lis:
        #                             lis.append(s)

        #         return lis
        #     time-O(n**3) space=O(1)
        if nums == []:
            return []
        nums.sort()
        #         # print(nums)
        #         arr=[]
        #         for i in range(0,len(nums)-1):
        #             if i>0 and nums[i-1]==nums[i]:
        #                 continue
        #             low=i+1
        #             high=len(nums)-1
        #             while (low<high):
        #                 if nums[i]+nums[low]+nums[high]==0:
        #                     arr.append([nums[i],nums[low],nums[high]])
        #                     low+=1
        #                     high-=1

        #                     while low<high and nums[low]==nums[low-1]:
        #                         low+=1
        #                     while low<high and nums[high]==nums[high+1]:
        #                         high-=1
        #                 elif nums[i]+nums[low]+nums[high]>0:
        #                     high-=1
        #                 else:
        #                     low+=1
        #         return arr
        # time=O(n**2) space-O(1)
        res = []

        def twosum(nums, i, res):
            j = i + 1
            seen = set()
            while j < len(nums):
                complement = -nums[i] - nums[j]
                if complement in seen:
                    res.append([nums[i], nums[j], complement])
                    while j + 1 < len(nums) and nums[j] == nums[j + 1]:
                        j += 1
                seen.add(nums[j])
                j += 1

        for i in range(len(nums)):

            if nums[i] > 0:
                break
            if i == 0 or nums[i - 1] != nums[i]:
                twosum(nums, i, res)
        return res
    # time-o(n**2) space-O(n)