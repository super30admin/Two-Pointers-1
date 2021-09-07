# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if len(nums) < 3:
            return []
        pos,neg,zeros = [],[],[]
        for i in range(len(nums)):
            if nums[i] == 0:
                zeros.append(nums[i])
            elif nums[i] > 0:
                pos.append(nums[i])
            elif nums[i] < 0:
                neg.append(nums[i])
        posSet,negSet,zerosSet,res = set(pos),set(neg),set(zeros),set()
        if len(zeros) >= 3:
            res.add((0,0,0))
        if zeros:
            for i in pos:
                if -1*i in neg:
                    res.add((i,0,-i))
        for k in range(len(pos)):
            for l in range(k+1,len(pos)):
                s = pos[k]+pos[l]
                if -1*s in negSet:
                    res.add((-1*s, min(pos[k],pos[l]), max(pos[k],pos[l])))
        for k in range(len(neg)):
            for l in range(k+1,len(neg)):
                s = neg[k]+neg[l]
                if abs(s) in posSet:
                    res.add((min(neg[k],neg[l]), max(neg[k],neg[l]),abs(s)))
        return res
          
