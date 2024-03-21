#T.C. O(n^2) + O(nlogn)
#S.C. O(n) where n = number of triplets
#Two Pointers Approach
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        ans = []
        snums = sorted(nums)
        for i in range(n):
            if i>0 and snums[i] == snums[i - 1]:
                continue
            j = i + 1
            k = n - 1
            while j < k:
                sum = snums[i] + snums[j] + snums[k]

                if sum < 0:
                    j+=1
                elif sum > 0:
                    k-=1
                else:
                    ans.append([snums[i], snums[j], snums[k]])
                    j += 1
                    k -= 1
                    while j < k and snums[j] == snums[j - 1]:
                        j += 1
                    while j < k and snums[k] == snums[k + 1]:    
                        k -= 1
        return ans
