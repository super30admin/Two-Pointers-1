// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach:
// Use pointers l and r to track zeros and twos respectively.
// If the number at mid is two, swap with numberr at r and move r towards left.
// If number at mid is zero, swap with number at l and move both pointers, repeat till mid crosses r.


class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int l=0,mid=0,r=n-1;
        while(mid<=r){
            if(nums[mid]==2){
                swap(nums,mid,r);
                r--;
            }
            else if(nums[mid]==0){
                swap(nums,l,mid);
                l++;mid++;
            }
            else{
                mid++;
            }
        }
    }
    private void swap(int[] arr,int i,int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}