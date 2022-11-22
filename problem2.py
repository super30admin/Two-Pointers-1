#time complexity: O(nlog(n))
#space complexity: O(1)
#ran on leetcode: yes
#sort the array. using i iterate through the elements. For each i, j will poin to i+1, k 
#will point to end of the array. move the 2 pointers based on the sum of values pointed by 
#i, j and k.
class Solution:
    def threeSum(self, nums):
        nums.sort()
        i=0
        L=[]
        while(i<len(nums)):
            if(i>0 and nums[i]==nums[i-1]):
                i+=1
                continue
            j=i+1
            #if(nums[])
            k=len(nums)-1
            while(j<k):
                if(nums[j]+nums[k]+nums[i]==0):
                    L.append([nums[i],nums[j],nums[k]])
                    j+=1
                    k-=1
                    while(j<len(nums) and nums[j]==nums[j-1]):
                        j+=1
                    while(k>j and nums[k]==nums[k+1]):
                        k-=1
                elif(nums[j]+nums[k]+nums[i]<0):
                    j+=1
                else:
                    k-=1
            i+=1
        return L
s=Solution()
nums = [-1,0,1,2,-1,-4]
print(s.threeSum(nums))


                