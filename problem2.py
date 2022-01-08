class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        siz = len(nums)
        ind =0
        target =0
        triplet =[]
        nums.sort()
        while ind <= siz-2:
            
            val1, ptr1,ptr2 =nums[ind], ind+1, siz-1
            if val1>target:
                break
            #print(ind,ptr1,ptr2)
            #find 2 sum for ind
            while ptr1<ptr2:
                sum3 = val1+ nums[ptr1]+ nums[ptr2]
                #print(sum3,ptr1,ptr2)
                if sum3> target:
                    ptr2-=1
                elif sum3 == target:
                    triplet.append([val1,nums[ptr1], nums[ptr2] ])
                    #print(val1,nums[ptr1], nums[ptr2] )
                    ptr1+=1
                    ptr2-=1  
                    while ptr1<ptr2 and nums[ptr1] == nums[ptr1+1]:
                        ptr1+=1
                    while ptr1<ptr2 and nums[ptr2] == nums[ptr2+1]:
                        ptr2-=1   
                    
                else:
                    ptr1+=1
                    
            #find next ind
            nxt = ind
            while (nums[nxt] == nums[ind]) and nxt < siz-2:
                nxt+=1
            ind = nxt
            
        return triplet
                
            
                    
                    
#time complexity O(n^2)
#space complexity O(1)