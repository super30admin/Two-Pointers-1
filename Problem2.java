// Time Complexity : o(n2)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

//logic is same like 2sum here we fix one element and for remaining array we take low and high ptrs and move low when sum is less and move high when sum is more
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        //to do 2pointer approach we need to sort array
        Arrays.sort(nums);
        //need to go until nums.length-2 as we also have low and high
        for(int i=0;i<nums.length-2;i++){
            //if intial element is only greater than 0 then we cant get 3sum from array
            if(nums[i]>0)break;
            //outside duplicacy i.e., move ptr until it reaches unique element this will                    help in removing duplicate 3 sums i.e., [-1,-1,2][2,-1,-1]
            if(i>0 && nums[i]==nums[i-1])continue;
            int low=i+1;
            int high=nums.length-1;
            while(low < high){
                int sum = nums[i]+nums[low]+nums[high];
                if(sum==0){
                    List<Integer> li = Arrays.asList(nums[low],nums[i],nums[high]);
                    result.add(li);
                    low++;
                    high--;
            //inside duplicacy i.e., inside array we need to move until it reaches unique and as we changed low and high above which are in base cond we need to check those as well
                     while(low < high && nums[low]==nums[low-1])low++;
                     while(low < high && nums[high]==nums[high+1] )high--;
                 }
                else if(sum <0){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
     return result; 
    }
}