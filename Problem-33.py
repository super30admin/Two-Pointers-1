
#sort colors- 75
#time complexity =O(N)
#space complexity =O(1)



#brute force solution
class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        c1,c2,c3=0,0,0
        for i in range(len(nums)):
            if nums[i]==0:
                c1+=1
            elif nums[i]==1:
                c2+=1
            else:
                c3+=1
        nums[:c1]=[0]*c1
        nums[c1:c2+c1]=[1]*c2
        nums[c1+c2:c3+c2+c1]=[2]*c3
        return nums