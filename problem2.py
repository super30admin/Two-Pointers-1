#time O(n)
#space O(1)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        counter = collections.Counter(nums) #remove duplicates
        numbers = counter.keys()
        res = set()
        comb = itertools.combinations(numbers,2)
        
        for c in comb:
            # print(c)
            fir, sec, check = c[0], c[1], -c[0]-c[1]
            if counter.get(check, None):
                if check != fir and check != sec:
                    res.add(tuple(sorted([fir, sec, check])))
                else:
                    if counter[check] > 1: #duplicates
                        res.add(tuple(sorted([fir, sec, check])))
        if counter.get(0, 0) > 2: # three or more 0s
            res.add((0,0,0))

        return [list(t) for t in res]