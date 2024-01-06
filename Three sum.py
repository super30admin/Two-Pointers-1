class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        triplets = []
        for i in range(len(nums)):
            if nums[i]==nums[i-1] and i>0:
                continue
            j=i+1
            k = len(nums) - 1
            while j<k:
                if (nums[i]+nums[j]+nums[k]) < 0:
                    j=j+1
                    while nums[j]==nums[j-1]and j<k:
                        j=j+1
                elif nums[i]+nums[j]+nums[k] > 0:
                    k=k-1
                    while nums[k]==nums[k+1] and j<k:
                        k=k-1
                else:
                    triplets.append([nums[i],nums[j],nums[k]])
                    j=j+1
                    k=k-1
                    while nums[j]==nums[j-1] and j<k:
                        j=j+1
                    while nums[k]==nums[k+1] and j<k:
                        k=k-1

        return triplets

#Time complexity: O(N^2)
#space complexity: O(N)
