#  https://leetcode.com/problems/3sum/

# Time Complexity : O(nlogn + n^2) ~ O(n^2)
# Space Complexity : O(k) k = no of triplets
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this :


# Your code here along with comments explaining your approach
# sort the array, fix one value take l = i + 1 and r = n-1 pointers and find the sum of these
# and see if it is = to 0 if yes append it to result else move the pointers and try and find the triplets
# do it for all the values hence n^2 TC


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        if(nums == None or len(nums) < 3):
            return result
        n = len(nums)
        nums.sort()
        for i in range(0,n-2):
            if nums[i] > 0 :
                break
            if(i>0 and nums[i]==nums[i-1]):
                continue
            l = i+1
            r = n-1
            while(l<r):
                curr = nums[i]+nums[l]+nums[r]
                if(curr == 0):
                    result.append([nums[i], nums[l],nums[r]])
                    l+=1
                    r-=1
                    while (l<r and nums[l] == nums[l-1]):
                        l+=1
                    while l<r and (nums[r]==nums[r+1]):
                        r-=1
                elif curr > 0:
                    r-=1
                else:
                    l+=1
        return result

            