#Space: O(1)
#Time: O(n^2)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n= len(nums)
        nums.sort()
        if( n < 3):
            return []
        if( n ==3):
            if(nums[0]+ nums[1]+ nums[2] == 0):
                return [[nums[0],nums[1], nums[2]]]
        
        final= list()
        print(nums)
        i=0
        while i < n-1:
            left= i +1
            right= n-1
            
            while(left < right):
                sum_all= nums[i]+ nums[left] + nums[right]
                if(sum_all == 0 ):
                    final.append([nums[i], nums[left], nums[right]])
                    right = right -1
                    left = left + 1
                    while((nums[right] == nums[right+1]) and right > left):
                        right = right -1
                    while ( (nums[left] == nums[left - 1]) and left < right):
                        left = left + 1
                elif(sum_all > 0 ):
                    right = right -1
                else:
                    left = left + 1
            i = i +1
            while((nums[i] == nums[i-1]) and i !=n-1):
                i= i + 1            
        return final

        
