Run a loop through nums for each element with index i. Take l=i+1 and r=n-1. 
Check the sum of the element with the element at r and l indecies. If the summation
 is 0 increment the left pointer till a uniqure element is met and decrement the right
  pointer. If the summation is less than 0, increse the left pointer till a unique
   element is met. If the sum is greater than 0 decrese the right pointer

Time complexity: O(n2)
Space complexity: O(1)

class Solution(object):

    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        n=len(nums)
        r=n-1
        l=0
        arr=[]
        nums.sort()
        for ind, i in enumerate(nums):
            if ind-1>=0 and i==nums[ind-1]:
                continue
        
            l=ind+1
            r=n-1
            while l<r:
                if l-1>ind and nums[l]==nums[l-1]:
                    l+=1
                    continue
                s= i+ nums[r]+nums[l]
                if s==0:
                    arr.append([i,nums[l],nums[r]])
                    l+=1
                    r-=1

                elif s<0:
                    l+=1
                else:
                    r-=1

        return arr




    


        