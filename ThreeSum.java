//Time Complexity : O(n^2). Sorting the array takes O(nlog n) time and the iterating the array is done in O(n^2) pattern. Hence the total tiime taken is O(n^2).
//Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null||nums.length==0){
            return new ArrayList<>();
        }
        
        //using two pointer approach
        List<List<Integer>> result = new ArrayList<>();
        //sort the array
        Arrays.sort(nums);
        //outer loop is stagnet until the low poinyer is less than high pointer
        for(int i=0;i<nums.length-2;i++){
            //declare the pointers
            int low = i+1, high = nums.length-1;
            //if the outer loop has repetitive values just continue
            if(i>0 && nums[i]==nums[i-1]){
                continue;   
            }
            //otherwise calculate sum
            while(low<high){
                int sum = nums[i]+nums[low]+nums[high];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;
                    high--;
                     //check for repetitive values from left side
                    while(low<high && nums[low]==nums[low-1]){
                        low++;
                    }
                    //check for repetitive values from right side
                     while(low<high && nums[high]==nums[high+1]){
                        high--;
                    }
                }
               
                //if sum is less than 0 move the low pointer to reach a zero sum
                else if(sum<0){
                    low++;
                }
                //if sum is larger than 0 move the high pointer to reach a zero sum
                else{
                    high--;
                }
            }
           
        }
         return result;
}