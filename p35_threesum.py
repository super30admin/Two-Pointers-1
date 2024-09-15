"""
https://leetcode.com/problems/3sum/
:return
Using Two Pointer approach, changing position of pointers basis on the value of sum if it is ==0 target, > target of less than
the target value, if it is greater than target then we move leftto find less numer since list is sorted.
Tc: O(nsquared), SC: O(1)
Ran on leetcode-yes
"""


class Solution:
    def threeSum(self, nums) :
        if len(nums)<3 or nums==None:
            return []
        # sorted=sorted(nums)
        # print(sorted)
        nums.sort()
        resultArray=[]
        for i in range(len(nums)-2):
            if i > 0 and nums[i]==nums[i-1]:
                continue
            if nums[i]>0:
                break
            low=i+1
            high=len(nums)-1
            # print("here i ", i, "is")
            while low<high:
                # print("here low is ", low, "and high is ", high)
                sum=nums[i]+nums[low]+nums[high]
                # print(sum)
                if sum==0:
                    resultArray.append([nums[i], nums[low],nums[high] ])
                    # print(resultArray)
                    low+=1
                    high-=1
                    ##for handling inside duplicity
                    while low< high and nums[low]==nums[low-1]:
                        low+=1
                    while low<high and nums[high]==nums[high+1]:
                        high-=1

                elif sum>0:
                    ##we will move closer to the number by moving high pointer left
                    high-=1

                else:
                    low+=1

        return resultArray
        # arrayList=[]



nums=[-1,0,1,2,-1,-4]
solve=Solution()
print(solve.threeSum(nums))






