// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public void sortColors(int[] nums) {

        int zero =0;
        int one = 0;
        int two =0 ;

        for(int i =0; i<nums.length; i++){
            if(nums[i] ==0){
                zero++;
            }
            else if(nums[i]==1){
                one++;
            }
            else{
                two++;
            }
        }
        int index =0;
        for(int i=1; i<=zero; i++){
            nums[index++] = 0;
        }
        for(int i=1; i<=one; i++){
            nums[index++] = 1;
        }
        for(int i=1; i<=two; i++){
            nums[index++] = 2;
        }
    }
}