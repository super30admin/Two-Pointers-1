class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        result = []
        
        list.sort(nums)
        print(nums)
        for i in range (0, len(nums)):
            left = i + 1
            right = len(nums) - 1
            if(i> 0 and nums[i-1] != nums[i]):
                while(left < right):
                    if(nums[i] + nums[left] + nums[right] == 0):
                        result.append([nums[i], nums[left], nums[right]])
                        left += 1
                        right -= 1
                    elif(nums[i] + nums[left] + nums[right] < 0):
                        left += 1
                    else:
                        right -= 1

        return result

 
object = Solution()
print(object.threeSum([-1,0,1,2,-1,-4]))
# -4, -1, -1, 0, 1, 2