# Time O(n)
# Space O(1)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        K = 0
        N = len(nums)
        i, j, k = 0, 1, N-1
        output=[]
        for i in range(N-2):
            if i>0 and nums[i] == nums[i-1]:
                continue
            j = i+1
            k = N-1
            remaining = K-nums[i]
            while j<k:
                left = nums[j]
                right = nums[k]
                total = left + right
                if total == remaining:
                    output.append((nums[i],nums[j],nums[k]))
                    while(j<k and nums[j]==left):
                        j+=1
                    while(k>j and nums[k]==right):
                        k-=1
                elif total > remaining:
                    k-=1
                else:
                    j+=1

        return output
