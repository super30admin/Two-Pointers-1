#Time Complexity O(N^2) O(NlogN) for sorting, n^2 for nested two pointer iterations
#Space Complexity O(1) We are not using set for avoiding duplicacy
#It successfully runs on the leetcode
#sorting and two pointers
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if not nums: return []
        n = len(nums)
        nums.sort()
        res=[]
        l, h = 0, n-1
        for i in range(n-2):

            #To avoid duplicacy
            if i > 0 and nums[i] == nums[i-1]: continue
            #To avoid unnecessary iterations
            if nums[i] >  0: break
            l = i+1
            h= n-1
            while l < h:
                sum= nums[i] + nums[l] + nums[h]
                if sum == 0:
                    res.append((nums[i],nums[l],nums[h]))
                    l+=1
                    h-=1
                    #to avoid inside duplicacy
                    while l < h and nums[l] == nums[l-1]: l+=1
                    while l < h and nums[h] == nums[h+1]: h-=1

                elif sum < 0:
                    l+=1

                else: 
                    h-=1
        return res
