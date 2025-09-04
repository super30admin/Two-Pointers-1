'''
For 3 sum, we can run an outer loop for first element, and do 2 sum techniques
to find the next 2 elements. 
2 sum techniques:
    1) N^2 nested loop 
    2) Hashing : O(N) time + O(N) space
        - If (Target - curr) in hashSet, then we found the pair. 
        - Keep storing the curr element in the hashSet
    3) Sort + 2 pointers : O(nlogn) + O(n)
        - Sort the array
        - Compute nums[Low pointer] + nums[high pointer]
            - If this sum > target:
                - Move high pointer 
            - If this sum < target:
                - Move low pointer
            - If this sum == target:
                - Bingo, found the pair
                - At this, we can move both low and high pointer
                    - Further optimized: move the low and high until we get new unique element. 
                    - This is to avoid duplicate pairs
    4) Sort + Binary search : O(nlogn) + O(nlogn)
        - Sort the array
        - Fix a number at i_th idx.
        - Binary search between i+1 and last element. 
        - Search for target - fixed_number  

Overall Complexity for 3 Sum: 
    - Method 1 : Nested Iterations
        - Time: O(N^3)
        - Space: O(N)
    - Method 2: Hashing (Search HashMap for target-curr)
        - Time: O(N^2) - For each outer loop, we do a linear search for rest of elements
        - Space: O(N) - Maintain one HashMap for all outer loop
    - Method 3: Sort + 2 pointers 
        - Time: O(NlogN) + O(N^2) = O(N^2) , Sort O(NlogN), Then for each outer loop, we do O(N) 
                for moving the two pointers
        - Space; O(1)
    - Method 4: Sort + Binary Search
        - Time: O(NlogN) + O(N^2*logN) = O(N^2*logN) , Sort O(NlogN), Then for each outer 
                loop, we fix a number from rest of numbers, and then do a binary search
                for finding the 3rd number. So for each outer loop, we do NlogN search. 
                Hence N*NlogN  
        - Space: O(1)
'''

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        method = 3 # 4 methods to solve the problem [1,2,3,4]
        
        self.pairs = []
        if method==3 or method==4:
            # last two methods need the array to be sorted
            nums.sort()
        
        if method==1 or method==2:
            self.pairSet = set()
        
        # start the outer loop
        for i in range(len(nums)-2):
            new_target = 0 - nums[i] # target for two sum algorithms
            if method==1:
                # nested loop
                self.method1(nums,new_target,i+1,nums[i])
            elif method==2:
                # Hashing
                self.method2(nums,new_target,i+1,nums[i])
            elif method==3:
                # 2 pointers
                if i!=0 and nums[i]==nums[i-1]: #since sorted, we don't want to repeat the same element
                    continue
                if nums[i]>new_target: # since we are dealing with sorted array, we won't find anything small
                    break
                self.method3(nums,new_target,i+1,nums[i])
            elif method==4:
                # Binary search
                if i!=0 and nums[i]==nums[i-1]: #since sorted, we don't want to repeat the same element
                    continue
                if nums[i]>new_target: # since we are dealing with sorted array, we won't find anything small
                    break
                self.method4(nums,new_target,i+1,nums[i])
            else:
                raise("Method Not implemented. Please select a method number from (1,2,3,4)")

        if method==1 or method==2:
            self.pairs = list(self.pairSet)

        return self.pairs

    # Method 1: 2-Sum with Nested Loops. O(N^2) time complexity, O(N) Space Complexity
    def method1(self,nums,target,low_idx,curr_element):
        for j in range(low_idx,len(nums)-1):
            for k in range(j+1,len(nums)):
                if nums[j]+nums[k] == target:
                    # found match. sort the elements and store in the hashSet. This
                    # will avoid the duplicate pair
                    curr_ans = (curr_element,nums[j],nums[k])
                    curr_ans = tuple(sorted(curr_ans))
                    self.pairSet.add(curr_ans)
    
    # Method 2: 2-Sum with Hashing. O(N) time complexity, O(N) Space Complexity
    def method2(self,nums,target,low_idx,curr_element):
        numsSet=set()
        for j in range(low_idx,len(nums)):
            if target-nums[j] in numsSet:
                # found match. sort the elements and store in the hashSet. This
                # will avoid the duplicate pair
                curr_ans = (curr_element,nums[j],target-nums[j])
                curr_ans = tuple(sorted(curr_ans))
                self.pairSet.add(curr_ans)
            
            numsSet.add(nums[j])
    
    # Method 3: 2-Sum with Sorting + 2 pointers. O(N) time complexity, O(1) Space complexity
    def method3(self,nums,target,low_idx,curr_element):
        left = low_idx
        right = len(nums)-1

        while left<right:
            curr_sum = nums[left]+nums[right]
            if curr_sum>target:
                # move right pointer to smaller value
                right-=1
            elif curr_sum<target:
                # move left pointer to higher value
                left+=1
            else:
                # found the match
                self.pairs.append([curr_element,nums[left],nums[right]])
                # move both the pointers
                left+=1
                right-=1
                # to avoid duplicates move left and right until they get new element
                while left<right and nums[left]==nums[left-1]:
                    left+=1
                while left<right and nums[right]==nums[right+1]:
                    right-=1

    # Method 4: 2-Sum with Sorting + Binary Search for each N.  O(NlogN) time complexity, O(1) space
    def method4(self,nums,target,low_idx,curr_element):
        j = low_idx
        while low_idx<=j<len(nums)-1:
            # for each j, do a binary search to find revised target
            left = j+1
            right = len(nums)-1
            revised_target = target - nums[j]
            mid = 0
            while left<=right:
                mid = left + (right-left)//2
                if nums[mid] == revised_target:
                    self.pairs.append([curr_element,nums[j],nums[mid]])
                     
                    break
                elif nums[mid]<revised_target:
                    # discard left half
                    left = mid+1
                else:
                    # discard right half
                    right = mid-1
            j+=1
            # move the j pointer until we find new element
            while j<len(nums)-1 and nums[j] == nums[j-1]:
                j+=1

