// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public void sortColors(int[] nums) {
        int zero=0;
        int one=0;
        int two=0;
        for(int i:nums){
            if(i==0){
                zero=zero+1;
            }else if(i==1){
                one=one+1;
            }else{
                two=two+1;
            }
        }
        int i=0;
        while(i<nums.length){
            while(zero>0){
                nums[i]=0;
                i=i+1;
                zero=zero-1;
            }
            while(one>0){
                nums[i]=1;
                i=i+1;
                one=one-1;
            }
            while(two>0){
                nums[i]=2;
                i=i+1;
                two=two-1;
            }
        }
    }
}