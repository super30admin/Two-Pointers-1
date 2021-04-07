class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        # Sort the nums array and convert the problem to two sum problem by iterating through the array.
        # Time Complexity is O(n2)
        # Space Complexity is O(1)
        out = []
        def findTriplet(target,low,high):
            while(low < high):
                #print(low,high)
                tot = nums[low] + nums[high]
                if(tot == -target):
                    out.append([target,nums[low],nums[high]])
                    while(low < high and nums[low] == nums[low+1]):
                        low+=1
                    while(low < high and nums[high] == nums[high-1]):
                        high-=1
                    low+=1
                    high-=1
                elif(tot < -target):
                    low+=1
                else:
                    high-=1
            
        
        nums.sort()
        
        for i in range(len(nums)-2):
            if( i!=0 and nums[i] == nums[i-1]):
                continue
            findTriplet(nums[i],i+1,len(nums)-1)
        
        return out