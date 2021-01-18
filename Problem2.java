// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList();
        //edge cases
        if(nums.length == 0 || nums == null) return ret;
        Arrays.sort(nums);
        //for loop that will increase the pivot
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue; //this checks the duplicate of the pivots
            //set low and high pointer
            int l = i + 1; int h = nums.length - 1;
            //this while loop goes through the array after pivot
            while(l < h){
                int sum = nums[l] + nums[h] + nums[i];
                //if sum is equal to 0 add in the 3 numbers then move low pointer up one and high pointer down one
                if(sum == 0){
                    List<Integer> addList = Arrays.asList(nums[l],nums[h],nums[i]);
                    ret.add(addList);
                    l++;
                    h--;
                    //check if the previous are the same as the one we are currently at
                    while(l < h &&  /*this base case needs to hold always */ nums[l] == nums[l - 1]) l++;
                    while(l < h && /*this base case needs to hold always */nums[h] == nums[h + 1]) h--; 
                }
                //if sum is greater than 0 then move high pointer down one
                else if(sum > 0){
                    h--;
                }
                //if sum is smaller than 0 then move low pointer up one
                else{
                    l++;
                }
            }
        }
        return ret;
    }
}