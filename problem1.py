#time complexity: O(n)
#sapce complexity: O(1)
#ran on leetcode: yes
#Use 2 pointers i, to point to the end of 0's, k to the start of 2's and
#use j to iterate through the array
#if you find a 0 while iterating, then swap it with value at i. similarly, if
#you find a 2 then swap current value with value pointeed by k, but this time do 
#not move the j pointer, since the newly swapped element could be a 0.
class Solution:
    def sortColors(self, nums) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        #i points to the partitio that has 0
        #k points to the partiton that has 2
        #j is used to iterate through the array and points to 1's

        i=-1
        k=len(nums)
        j=0
        while(j<k):
            if(nums[j]==0):
                #swap nums[i+1] and nums[j]
                temp=nums[i+1]
                nums[i+1]=nums[j]
                nums[j]=temp
                i+=1
                j+=1
            elif(nums[j]==2):
                #swap nums[j] with nums[k-1]
                temp=nums[k-1]
                nums[k-1]=nums[j]
                nums[j]=temp
                k-=1
            else:
                j+=1
s=Solution()
nums = [2,0,2,1,1,0]
s.sortColors(nums)
print(nums)
