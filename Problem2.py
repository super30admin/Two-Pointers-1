#I started by sorting the input array to make it easier to handle duplicates and to use a two-pointer technique. Then, I iterate through the array, fixing one number at a time. For each fixed number, I use two pointers (j and k) to find pairs in the remaining array that sum up to the negative of the fixed number. This way, the three numbers will add up to zero. I move the pointers based on whether the current sum is less than or greater than zero. When I find a valid triplet, I add it to the result list. To avoid duplicates, I skip over repeated values for the fixed number and the two pointers. This approach allows me to find all unique triplets that sum to zero in a more efficient manner than checking all possible combinations.

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        ans = []
        nums.sort()
        for i in range(n):
            if i != 0 and nums[i] == nums[i - 1]:
                continue
            j = i+1
            k = n-1
            while j<k:
                sum = nums[i]+nums[j]+nums[k]
                if sum<0:
                    j+=1
                elif sum>0:
                    k-=1
                else:
                    temp = [nums[i],nums[j],nums[k]]
                    ans.append(temp)
                    j+=1
                    k-=1
                    while j<k and nums[j]==nums[j-1]:
                        j+=1
                    while j<k and nums[k]==nums[+1]:
                        k-=1
        return ans