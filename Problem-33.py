
#sort colors- 75
#time complexity =O(N)
#space complexity =O(1)



#brute force solution
class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        c1,c2,c3=0,0,0
        for i in range(len(nums)):
            if nums[i]==0:
                c1+=1
            elif nums[i]==1:
                c2+=1
            else:
                c3+=1
        nums[:c1]=[0]*c1
        nums[c1:c2+c1]=[1]*c2
        nums[c1+c2:c3+c2+c1]=[2]*c3
        return nums

    
# two pointer approach
#time complexity -O(N)
#space complexity =O(1)
#passed the test cases
# we need to take three pointers low,mid and high. if mid value is 2 then we swap mid with high value at the same time decrement the high value. We mid value is 0 we swap mid with low value and increment both low and mid value. If mid is 1 we just increment the mid value.

class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        low=0
        mid=0
        high=len(nums)-1
        
        while mid<=high:
            
            if nums[mid]==2:
                self.swap(nums,mid,high)
                high=high-1
            elif nums[mid]==0:
                self.swap(nums,mid,low)
                low=low+1
                mid=mid+1
            else:
                mid=mid+1
    def swap(self,nums,i,j):
        temp=nums[i]
        nums[i]=nums[j]
        nums[j]=temp