// Time Complexity : O(n^2), n is size of array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length < 3) return res;
        Arrays.sort(nums); 
        //sort the array, as we are changing low and high value based on sum
        //i.e if sum is less than 0, we increment low else increment high
        int n = nums.length;
        
        for(int i = 0; i < n-2; i++) { 
            if(nums[i] > 0) break; //if nums[i] > 0 we will never have sum == 0, as array is sorted
            //so come out of loop
            //set i, for each i, we check diff combination of low and high
            // < n-2 as low will be n-2 and high will be n-1. 
            if(i == 0 || nums[i] != nums[i-1]) { //to avoid duplicates, check is i is equal to i-1
                int low = i+1; //set low as next element of i
                int high = n-1; //set high as last element
                while(low < high) {
                    int sum = nums[i] + nums[low] + nums[high]; //find sum
                    if(sum == 0) {
                        //if sum = 0, add to result
                        res.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        //increment low and high to check diff combination for same i 
                        low++;
                        high--;
                        //to avoid duplicates
                        //each time check if low does not cross high
                        while(low<high && nums[low] == nums[low-1]) low++;
                        while(low<high && nums[high] == nums[high+1]) high--;
                        
                    }
                    //if sum < 0, we know low value should increase, increment low
                    else if(sum < 0) {
                        low++;
                    }
                    //if sum > 0, we know high value should decrease, decrement high
                    else {
                        high--;
                    }
                    
                }
                
            }
            
        } return res; 
        
    }
}
