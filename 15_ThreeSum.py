#  Time Complexity : O(n^2)
#  Space Complexity : O(1)



class Solution:
    def threeSum(self, nums):

        n = len(nums)
        result = []
        nums = sorted(nums)
        if nums == None or len(nums) == 0:
            return result
        

        for i in range(0,n-1):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            if nums[i] > 0:
                break
            low = i + 1
            high = n-1
            
            while low < high:
                ThreeSum = nums[i] + nums[low] + nums[high]
                if ThreeSum == 0:
                    li = [nums[i],nums[low],nums[high]]
                    result.append(li)
                    low = low + 1
                    high = high -1
                    while low < high and nums[low] == nums[low+1]:
                        low = low + 1
                    while low < high and nums[high] == nums[high-1]:
                        high = high -1
                elif ThreeSum > 0:
                    high = high -1
                else:
                    low = low + 1
        return result

obj = Solution()
print(obj.threeSum([-1,0,1,2,-1,-4]))
        