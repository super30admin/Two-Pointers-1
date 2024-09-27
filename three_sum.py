class Solution(object):
        
    def threeSum(self, nums ) :

        nums.sort()
        solutions = {}
        nummap = {}
        for i in range(len(nums)) :
            if not nummap.get(nums[i]) :
                nummap[nums[i]] = []
            if len(nummap[nums[i]]) < 3 : 
                nummap[nums[i]].append(i)
        
        for a in range (len(nums)) :
            for b in range(a+1, len(nums)) :
                if (nums[b] != nums[b-1]) or (b == a+1)  :
                    if nummap.get(-nums[a] - nums[b]) :
                        s = filter(lambda x : x > b , nummap[-nums[a] - nums[b]])
                        for c in s :
                            solutions[str(sorted([nums[a],nums[b],nums[c]]))] = [nums[a],nums[b],nums[c]]
                        

        return solutions.values()
