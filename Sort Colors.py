# Time complexity: O(n)
# Space Complexity: O(1)


class Solution:
    def sortColors(self, nums: List[int]) -> None:
     """
     Do not return anything, modify nums in-place instead.
     """
     start=0
     end=len(nums)-1
     mid=0

     while(mid<=end):

         if(nums[mid]==0):
             self.swap(nums,start,mid)
             start+=1
             mid+=1

         elif(nums[mid]==2):
             self.swap(nums,mid,end)
             end-=1

         else:
             mid+=1


    def swap(self,nums,left,right):
     temp=nums[left]
     nums[left]=nums[right]
     nums[right]=temp


        
# Python Two Pass Method:

#         countOfZeroes=0
#         countofOnes=0
#         countOfTwos=0
        
#         for i in range(len(nums)):
#             if nums[i]==0:
#                 countOfZeroes+=1
#             elif nums[i]==1:
#                 countofOnes+=1
#             elif nums[i]==2:
#                 countOfTwos+=1
        
#         for i in range(countOfZeroes):
#             nums[i]=0
            
#         print(nums)
        
#         for i in range(len(nums)):
#             if(i<countOfZeroes):
#                 nums[i]=0
            
#             elif(i<countOfZeroes+countofOnes and i>=countOfZeroes):
#                 nums[i]=1
                
#             elif(i<countOfZeroes+countofOnes+countOfTwos and i>=countOfZeroes+countofOnes):
#                 nums[i]=2
#         return nums
            
            
        