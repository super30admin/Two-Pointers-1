
 // Time Complexity : O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //sort the array
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        
        //for loop to keep the first element of result list constant -- n-2 since we need triplets 
        for(int i=0;i<nums.length-2;i++){           
    //check if a is not same as previous num with edge case check to get unique result sets
            if(i==0||i>0 &&(nums[i]!=nums[i-1])){
                  //a+b+c=0 that means b+c=0-a ; sum=b+c -- using 2 pointer find b+c , since a is the first element already constant
            int sum = 0-nums[i];
    //to perform two pointer 
                int l=i+1;
                int r=nums.length-1;
                while(l<r){
                    if(nums[l]+nums[r]==sum){
                        res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                      
                        //to skip the duplicates
                        while(l<r && nums[l]==nums[l+1])l++;
                        while(l<r && nums[r]==nums[r-1])r--;
                        //to set low and high to next unique num
                        l++;
                        r--;
                             }
                        else if(nums[l]+nums[r]<sum){
                            
                            l++;
                        }
                        else{
                            r--;
                        }
                   
                }
        
            }
        }
        return res;
    }
}