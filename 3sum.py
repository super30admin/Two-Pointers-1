#using hashset
#TC: O(n^2)
#SC: O(n)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        hset = set()
        nums.sort()
        n = len(nums)
        tripletset = []
        
        for i in range(n):
            #if the array is sorted and we reach > 0, we for sure know, there are all positives ahead, so theres no way I can make sum 0
            if nums[i] > 0: 
                break
            #i > 0 is imp bcuz, we are comapring nusm[i-1]
            #and we need to move i until we find next unique
            if i == 0 or nums[i] != nums[i-1]:
                need = -1*nums[i]
                j = i+1
                while j < n:
                    if need - nums[j]  in hset:
                        tripletset.append([nums[i], nums[j],(need - nums[j])])
                        while j+1 < n and nums[j] == nums[j+1]:
                            j += 1
                    hset.add(nums[j])
                    j += 1
        return tripletset
                

#using binary search
#TC: O(n^2logn)
#SC: O(1)


#two pointers
#TC: O(n^2)
#SC: O(1)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        nums.sort()
        print(nums)
        triplet = []
        for i in range(n - 2):
            # outer duplicacy
            if i > 0 and nums[i] == nums[i-1]:
                continue
            l = i + 1
            r = n - 1

            while l< r:
                currSum = nums[i] + nums [l] + nums[r]

                if currSum == 0:
                    li = [nums[i] , nums [l] , nums[r]]
                    triplet.append(li)
                    l += 1
                    r -= 1
                    # inner duplicacy
                    while l < r and (nums[l] == nums[l-1]):
                        l += 1
                    while l < r and (nums[r] == nums[r+1]):
                        r -= 1      
                elif currSum > 0: 
                    r-= 1                 
                else:
                    l += 1
        return triplet
                