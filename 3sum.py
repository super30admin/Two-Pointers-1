#time complexity: o(n^2)+o(nlogn) = o(n^2), n for outer for loop and for each outer loop we have an inner while loop; nlogn is for sorting
#space complexity:o(1)
#passed all cases on LeetCode:yes
#difficulty faced:
# comments:in the code
#https://leetcode.com/problems/3sum/

class Solution:
    def threeSum(self, nums: 'List[int]') -> 'List[List[int]]':
        
        res = []
        #hashset so we have unique set of lists
        l1 = set()
        n = len(nums)
        
        nums.sort()
        #print(nums)

        #fix the 1st element and se we traverse in this for loop
        for i in range(0,n):
            #should not take into account an element previously encountered othw will result in duplicate arrays
            if(i>0 and nums[i] == nums[i-1]):
                continue
            #if nums[i] > 0:
            #    break
            
            #for each element above we use 2 pointers to traverse rest of array
            left = i+1
            right = len(nums)-1
            while(left < right):
                sum1 = nums[i]+nums[left]+nums[right]
                if(sum1 == 0):
                    #have to convert to tuple bec lists being mutable cannot be added to hashset
                    l2 = tuple((nums[i],nums[left],nums[right]))
                    l1.add(l2)
                    #remember to convert back to list when adding to result
                    res.append(list(l2))
                    left+=1  #when elements are found, move both pointers bec we want to find next pair now
                    right-=1
                    #keep moving left/right ptrs if theyre same to avoid duplicate pairs like the continue statement above
                    #remember to check lef<right cond since this while loop can keep on incrementing left/right othw
                    while(left < right and nums[left] == nums[left-1]):
                        left+=1
                    while(left < right and nums[right] == nums[right+1]):
                        right-=1
                
                elif(sum1<0):
                    left += 1
                elif(sum1 > 0):
                    right -= 1
                    
        return res

#s1 = Solution()
#ar1 = [-1,0,1,2,-1,-4]
#print(s1.threeSum(ar1))