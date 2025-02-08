// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


/*
using 3 pointers, l at 0, r at (n-1) and mid at 0. l collects 0, mid collects 1 and r collects 2.
When nums[mid]==0, swap with left and increment left and mid. When nums[mid]==2, swap with right and decrement r.
Else increment mid.
*/
class SortColors {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        int mid=l;
        //for [2,0,1]
        while(mid<=r){
            if(nums[mid]==2){
                swap(nums,mid,r);
                r--;
            }else if(nums[mid]==0){
                swap(nums,l,mid);
                l++;
                mid++;
            }else{
                mid++;
            }
        }
        
    }
    //return void -> pass by reference
    private void swap(int[] nums,int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
