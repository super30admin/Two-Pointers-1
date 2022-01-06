'''
T.C: O(n^2) = n for loop, n for two sum + nlogn for sort
S.C: O(1)

Intuition: reduce to two pointer technique
-
'''
class Solution:
    
    def twoSum(self, target, low, high, arr, curr):
        rs = list()
        while low < high:
            sums = arr[low] + arr[high]
            if sums > target:
                high -= 1
            elif sums < target:
                low += 1
            else:
                rs.append([arr[curr], arr[low], arr[high]])
                low += 1 
                high -= 1
                
                while low < high and arr[low - 1] == arr[low]:
                    low += 1
                while low < high and arr[high + 1] == arr[high]:
                    high -= 1
        
        return rs
                     
    
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nlen = len(nums)        
        res = list()
        snums = sorted(nums)
        
        for idx in range(nlen - 2):
            if idx > 0 and snums[idx - 1] == snums[idx]:
                continue
            target = -1 * snums[idx]
            rs = self.twoSum(target, idx + 1, nlen - 1, snums, idx)
            if rs:
                res += rs
            
        return res