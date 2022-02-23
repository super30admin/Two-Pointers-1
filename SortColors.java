// Time Complexity :O(n) n=number of elements
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach

//Using two points l & r, make sure that everything before l is 0 and everything after r is 1 and then fill up remaining space with 1

class Solution {
    public void sortColors(int[] nums) {
        int l=0,r=nums.length-1, a=0;
        while(a<=r){
            if(nums[a]==2){
                swap (nums,a,r);
                --r;
                
            }else if(nums[a]==1){
                
                ++a;
            }else{
                swap(nums,l,a);
                ++a;
                ++l;
            }     
        }    
    }
    private void swap(int[] arr,int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}