class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        triplets = []
        for i in range(len(nums)-2):
            if nums[i]==nums[i-1] and i!=0:
                continue
            if nums[i]>0:
                break
            unsortedele = []
            low=i+1
            high = len(nums)-1
            while low<high:
                if nums[low]+nums[high]==-nums[i]:
                    unsortedele = [nums[i],nums[low],nums[high]]
                    # unsortedele.sort()
                    # if unsortedele not in triplets:
                    triplets.append(unsortedele)
                    low+=1
                    high-=1
                    while low<high and nums[low]==nums[low-1]:
                        low+=1
                    while low<high and nums[high]==nums[high+1]:
                        high-=1       
                elif nums[low]+nums[high]+nums[i]<0:
                    low+=1
                else:
                    high-=1
        return triplets
    
    """Time complexity - O(n^2)
    Space complexity - O(1)"""
#         nums.sort()
#         triplets = []
#         for i in range(len(nums)-2):
#             if nums[i]==nums[i-1] and i!=0:
#                 continue
#             if nums[i]>0:
#                 break
#             unsortedele = []
#             for j in range(i+1, len(nums)-1):
#                 if nums[j]==nums[j-1] and j!=i+1:
#                     continue
#                 index = self.binarysearch(-nums[i]-nums[j], j+1, len(nums)-1, nums)
#                 if index==-1:
#                     continue
#                 unsortedele = [nums[i],nums[j], nums[index]]
#                 triplets.append(unsortedele)
#         return triplets
#     def binarysearch(self, num, low, high, nums):
#         while low<=high:
#             mid = low+(high-low)//2
#             if nums[mid]==num:
#                 return mid
#             elif nums[mid]>num:
#                 high = mid-1
#             else:
#                 low=mid+1
#         return -1
    
#     """Time Complexity=O(n^2*logn)
#     space complexity =O(1)"""
                
    
        # O(n^3) complexity
        # li = []
        # if not nums or len(nums)<3:
        #     return
        # for i in range(len(nums)-2):
        #     for j in range(i+1, len(nums)-1):
        #         for k in range(j+1, len(nums)):
        #             unsortele = []
        #             if nums[i]+nums[j]+nums[k]==0:
        #                 unsortele = [nums[i],nums[j],nums[k]]
        #                 unsortele.sort()
        #                 if unsortele not in li:
        #                     li.append(unsortele)
        # return li
                
        