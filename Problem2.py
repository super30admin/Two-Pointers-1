#Time complexity: O(nlogn + n^2)
Space complexity: O(n)

#Sort the array first. Use two pointer, j which starts from i+1 and k other from end. If the sum is greater decrement j and if the sum is smaller increment i. Add the result to the set

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        output=set()
        for i in range(0, len(nums)-1):
            j=i+1
            k=len(nums)-1
            while(j<k):
                total=nums[i] + nums[j] + nums[k]
                if(total==0):
                    output.add((nums[i],nums[j],nums[k]))
                    j=j+1
                    k=k-1
                elif total>0:
                    k=k-1
                else:
                    j=j+1
        return list(output)