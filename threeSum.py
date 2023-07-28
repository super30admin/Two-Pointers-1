class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:

        def twoSum(arr, target) -> List[List[int]]:
            s = set()
            res = []
            for i in range(len(arr)):
                if target - arr[i] in s:
                    res.append([target - arr[i], arr[i]])
                else:
                    s.add(arr[i])
            return res

        output = set()
        for idx, num in enumerate(nums):     
            target = 0 - num
            twoSumRes = twoSum(nums[idx+1:], target)
            for val in twoSumRes:
                val.append(nums[idx])
                output.add(tuple(sorted(val)))
            
        return [list(t) for t in output]


