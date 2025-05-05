class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # n^3 just sorted first

        # nums.sort()
        # result = set()
        # for i in range(len(nums)):
        #     for j in range(i + 1, len(nums)):
        #         total = nums[i] + nums[j]
        #         k = j + 1
        #         while k < len(nums):
        #             if total + nums[k] == 0:
        #                 result.add(tuple([nums[i], nums[j], nums[k]]))
        #                 break
        #             k += 1

        # n^2

        # result = set()
        # nums.sort()
        # for i in range(len(nums)):
        #     hashmap = set()
        #     for j in range(i + 1, len(nums)):
        #         total = 0 - nums[j] - nums[i] 
        #         if total in hashmap:
        #             result.add(tuple([total, nums[j], nums[i]]))
        #         else:
        #             hashmap.add(nums[j])

        # return list(result)

        #n^2 two pointers

        result = set()
        nums.sort()
        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            left, right = i + 1, len(nums) - 1
            while left < right:
                total = nums[i] + nums[left] + nums[right] 
                if total > 0:
                    right -= 1
                elif total == 0:
                    result.add(tuple([nums[i], nums[left], nums[right]]))
                    left += 1
                    right -= 1
                    while nums[left] == nums[left - 1] and left < right:
                        left += 1
                    while nums[right] == nums[right + 1] and left < right:
                        right -= 1
                else:
                    left += 1
                    

        return list(result)
                


       
        

       
