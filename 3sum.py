class Solution:
    # time = O(n^2)[best solution]
    # space =O(1)
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        # sort nums
        nums.sort()
        # 3 pointers
        # i 
        # low and high in the sub aray

        for i in range(len(nums)-2):
            if i>0 and nums[i] == nums[i-1]:
                continue
            if nums[i]>0:
                break
            low = i+1
            high = len(nums)-1
            while low<high:
                total = nums[low]+nums[high]+nums[i]
                if total == 0:
                    # check if result already has it else append
                    triplet = [nums[low],nums[high],nums[i]]
                    result.append(triplet)
                    low+=1
                    high-=1
                    # check base case to avoid out of bounds error
                    # this is beacuse pointer is being incremented or deremented mid loop 
                    while(low<high and nums[low]== nums[low-1]):
                        low+=1
                    while(low<high and nums[high]==nums[high+1]):
                        high-=1
                # if triplet not found change pointers
                elif total<0:
                    low+=1
                else:
                    high-=1
                
        return result
        