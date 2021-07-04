'''

Did it run on leet code: Yes
Time complexity: 0(nlogn+n2)
Space Complexity: 0(N)

Algorithm:
- sort the Array
- Then we have three pointer (i,j,k)
- we have two sub arrays nums[:i] and nums[i:]
- in nums[i:] we have two pointers `j` and `k`. and we progress similiar to two sum behaviour.
and find a triplet of (i,j,k).

'''



class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums = sorted(nums)
        sol_set,size = [],len(nums)
        for i in range(size):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            j,k = i+1,size-1
            while j<k:
                res = nums[i]+nums[j]+nums[k]
                if res == 0:
                    sol_set.append([nums[i], nums[j], nums[k]])
                    j = j+1
                    while j<k and nums[j] == nums[j-1]:
                        j+=1
                elif res<0:
                    j +=1
                else:
                    k-=1
        return sol_set