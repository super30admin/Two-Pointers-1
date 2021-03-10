'''
TC: O(n)
SC: O(1)
Leetcode: Success!
Problems: The conditions.
'''

class Solution:
    def threeSum(self, nums):

        # Sanity checks
        if nums == None or len(nums)==0:
            return []
        nums = sorted(nums)
        Sum = 0
        li = []
        result = []
        for i in range(len(nums)-2):
            if i>0 and nums[i]==nums[i-1]: continue
            low = i + 1
            high = len(nums)-1
            while low < high:
                Sum = nums[i] + nums[low] + nums[high]
                if Sum == 0:
                    li = [nums[i] , nums[low] , nums[high]]
                    '''append(nums[i])
                    li.append(nums[low])
                    li.append(nums[high])'''
                    result.append(li)
                    low +=1
                    high -=1
                    while low<high and nums[low] == nums[low-1]: low+=1
                    while low <high and nums[high] == nums[high+1]: high-=1

                elif Sum<0:
                    low += 1
                else:
                    high -=1
                pass
        return result

s = Solution()

nums = [-1,0,1,2,-1,-4]
# nums = []
# nums = [0]
print("resultant arrays: ",s.threeSum(nums))
