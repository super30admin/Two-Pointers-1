"""
To skip duplicates and use two pointers, we sort the array
For each index i, manage nums[i], and use two pointers (left, right) to find pairs nums[j] + nums[k] = -nums[i]
Skip duplicates using while loops after finding a valid triplet
"""
"""
TIme Complexity: O(n^2) — Outer loop n times, inner two-pointer is O(n)
Space Complexity: O(1) extra
"""

class threeSum:
    def threeSums(self, nums: list[int]) -> list[list[int]]:

        nums.sort()
        res = []

        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            j = i + 1
            k = len(nums) - 1

            while j < k:
                total = nums[i] + nums[j] + nums[k]
                if total < 0:
                    j += 1
                elif total > 0:
                    k -= 1
                else:
                    res.append([nums[i], nums[j], nums[k]])
                    j += 1
                    k -= 1

                    while j < k and nums[j] == nums[j - 1]:
                        j += 1
                    while j < k and nums[k] == nums[k + 1]:
                        k -= 1

        return res
   
                
if __name__=="__main__":
    obj = threeSum()
    nums = [-1,0,1,2,-1,-4]
    print(obj.threeSums(nums))
                    


