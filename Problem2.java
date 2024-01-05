// Time Complexity :  O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
/*
*  1. Fix the first element and apply two sum solution on other part.
        Two sum solution techniques:
            a. Bruteforce - O(n^3)
            b. Fix one element and apply Binary Search - 
                        (sorting -->O(n*nlogn)) 
            c. Two pointer technique - O(n^2)
            d. Hashing - O(n^2)
* 
*  2. Applying the two pointer technique,
        sort the entire array - O(nlogn)
        
        fix the first element, apply two pointer on remaining part.
        if sum < 0
            move left pointer
        
        else if sum >0 
            move right pointer.
        
        else 
            move both pointers and check for duplicates.
            (because we should eliminate triplet duplicates)
        To avoid inner duplicates, 
            we can check previous element with curr in case of start pointer
            we can cehck curr element with next in case of end pointer.
* 
*  3. Similarly, outer duplicates can be avoided by checking prev and curr.
        When first element is >0, we cannot find any triplets whose sum is 0.
        therefore, we break.
        */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new  ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i =0; i< n-2; i++)
        {
            if(nums[i] > 0) break;
            if(i != 0 && nums[i] == nums[i-1]) continue;
            int l = i+1; int r = n-1;
            while(l < r)
            {
                int curr = nums[i] + nums[l] + nums[r];
                if(curr == 0)
                {
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                
                while(l < r && nums[l] == nums[l-1]) l++;  //when we are using while loop we need to check the while condition again.
                while(l < r && nums[r] == nums[r+1]) r--;
                }else if(curr < 0) l++;
                else r--;
            }
        }
        return result;
    }
}
