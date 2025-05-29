'''
BRUTE FORCE SOLUTION 
Time Complexity: O(n^2)
Space Complexity: O(n)


'''

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:

        res = set()
        counter = defaultdict(list)

        for i in range(len(nums)):
            counter[nums[i]].append(i)

        def twoSum(k):
            output = set()
            for idx, num in enumerate(nums):
                # x+y = k
                # num = x
                # if (k - num) is in nums:
                if len(counter[k - num]) > 0:
                    idxes = counter[k - num]
                    for i in idxes:
                        if idx != i:
                            output.add((idx, i))
            return output

        for idx, num in enumerate(nums):
            twoRes = twoSum(-num)
            if len(twoRes) > 0:
                for item in twoRes:
                    (x, y) = item
                    if idx != x and idx != y:
                        res.add(tuple(sorted((num, nums[x], nums[y]))))

        res = [list(i) for i in res]
        return res
