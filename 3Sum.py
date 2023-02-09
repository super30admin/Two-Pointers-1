#All TC on leetcode passed

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:


        
        #Here we sort the nums. On the sorted array we keep a num fixed each time and perform 2 
        #pointers technique on the remaining array to find the triplets.
        #Time complexity: O(nlogn)+O(n^2) => O(n^2)
        #Space complexity: O(1)
        res = []

        nums.sort()
        for i in range(len(nums)):

            if nums[i]>0:
                break
            
            if i==0 or nums[i]!=nums[i-1]:
                l = i+1
                h = len(nums)-1

                while l<h:
                    if nums[i]+nums[l]+nums[h]==0:
                        res.append([nums[i],nums[l],nums[h]])
                        l+=1
                        h-=1
                        while l<h and nums[l]==nums[l-1]:
                            l+=1
                        while l<h and nums[h]==nums[h+1]:
                            h-=1
                    elif nums[i]+nums[l]+nums[h]<0:
                        l+=1
                    else:
                        h-=1
        return res

        #-------------------OR-------------------------------

        #Here we keep 1 num fixed each time and perform 2Sum hashing technique on the 
        #remaining array to find the complement of the fixed num.
        #Time complexity: O(n^2)
        #Space complexity: O(1)
        res = set()
       
        for i in range(len(nums)-2):
            nTarget = 0 - nums[i]
            dict = {}
            for j in range(i+1, len(nums)):
                if nTarget-nums[j] in dict:
                    l = [nums[i], nums[j], nTarget-nums[j]]
                    l.sort()
                    res.add(tuple(l))
                else:
                    dict[nums[j]] = 1
        return list(res)


        #-------------------OR-------------------------------


        #Here we use 3 for loops to find the triplets.
        #Time complexity: O(n^3)
        #Space complexity: O(1)
        res = set()

        for i in range(len(nums)-2):
            for j in range(i+1,len(nums)-1):
                for k in range(j+1, len(nums)):
                    if nums[i]+nums[j]+nums[k]==0:
                        l = [nums[i],nums[j],nums[k]]
                        l.sort()
                        res.add(tuple(l))
        return list(res)


        #-------------------OR-------------------------------


        #Here we sort the nums. On the sorted array we keep 2 nums fixed each time and perform binary 
        #search technique on the remaining array to find the complement of the fixed nums.
        #Time complexity: O(nlogn)+O(n^2logn) => O(n^2logn)
        #Space complexity: O(1)
        res = []

        nums.sort()

        for i in range(len(nums)-2):
            if i>0 and nums[i]==nums[i-1]:
                continue
            for j in range(i+1, len(nums)-1):
                if j>i+1 and nums[j]==nums[j-1]:
                    continue
                nTarget = 0 - (nums[i]+nums[j])
                l = j+1
                h = len(nums)-1
                while l<=h:
                    mid = (l+h)//2
                    if nums[mid] == nTarget:
                        res.append([nums[i], nums[j], nums[mid]])
                        break
                    elif nums[mid] < nTarget:
                        l+=1
                    else:
                        h-=1
        return res









        