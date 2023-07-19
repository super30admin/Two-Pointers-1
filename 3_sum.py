class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        nums_sorted = sorted(nums)

        result = []
        for i in range(0,len(nums_sorted)):
            j = i+1
            k = len(nums_sorted) - 1
            while j < k:

                if nums_sorted[i] + nums_sorted[j] + nums_sorted[k] == 0:
                    if [nums_sorted[i],nums_sorted[j],nums_sorted[k]] not in result:
                        result.append([nums_sorted[i],nums_sorted[j],nums_sorted[k]])
                    k = k -1

                elif nums_sorted[i] + nums_sorted[j] + nums_sorted[k] < 0:
                    j = j + 1
                
                else:
                    k = k - 1
    

        return result
