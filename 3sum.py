class Solution:
    def threeSum(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        nums.sort()
        res = []

        for i in range(len(nums)-1):
            if nums[i] > 0:
                break
            
            if i > 0 and nums[i] == nums[i-1]:
                # avoid repeat
                continue
            
            j = i+1
            k = len(nums)-1

            while j < k:
                total = nums[i] + nums[j] + nums[k]

                if total == 0:
                    res.append([nums[i],nums[j],nums[k]])
                    j += 1
                    k -= 1
                    while nums[j] == nums[j-1] and j<k:
                        j+=1
                    while nums[k] == nums[k+1] and j<k:
                        k-=1
                elif total > 0:
                    k -=1
                else:
                    j += 1
        
        return res
    
# TC : O(n*n)
# SC : O(1)