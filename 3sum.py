# Time Complexity: O(nlogn) + O(n^2) ~ O(n ^ 2)
# Space Complexity: O(1)

# First step is to sort the array. Once sorted, we go to each element and conduct a two-sum with target
# 0 - nums[i]

# To keep unique answers, we keep moving outside pointer until we find an element different than the previous nums[i]

# To keep unique answers inside, we keep moving the high and low pointer until a different element is found

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        i = 0
        L = []
        while(i<len(nums)):
            if(i > 0 and nums[i] == nums[i-1]):
                i += 1
                continue

            j = i+1
            k = len(nums)-1

            while(j < k):
                if(nums[j]+nums[k]+nums[i]==0):
                    L.append([nums[i],nums[j],nums[k]])
                    j+=1
                    k-=1
                    while(j<len(nums) and nums[j]==nums[j-1]):
                        j+=1
                    while(k>j and nums[k]==nums[k+1]):
                        k-=1
                elif(nums[j]+nums[k]+nums[i]<0):
                    j += 1
                else:
                    k -= 1
            i += 1
        return L
