#TimeComplexity:O(N) 
#SpaceComplexity: No extra space used.
#Did this code successfully run on Leetcode : Yes 
#Any problem you faced while coding this : No
class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        def swap(nums,a,b):
            temp=nums[a]
            nums[a]=nums[b]
            nums[b]=temp
            
        #Using 2 pointers
        i,cur=0,0
        j=len(nums)-1
        while cur<=j:
            if nums[cur]==0:
                swap(nums,cur,i)
                i+=1;cur+=1
            elif nums[cur]==1:
                cur+=1
            else:
                swap(nums,cur,j)
                j-=1
                #cur+=1

        '''
        #count the no of 0,1,2 and replace accordingly.
        a,b,c=0,0,0
        for i in nums:
            if i==0:
                a+=1
            elif i==1:
                b+=1
            else:
                c+=1
        print(a,b,c)
        for i in range(len(nums)):
            if i<a:
                nums[i]=0
            elif i<a+b:
                nums[i]=1
            else:
                nums[i]=2
        return nums 
        '''