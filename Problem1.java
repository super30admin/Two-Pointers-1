//TC=O(n)
//SC=O(1)

class Solution {
    
    private void swap(int[] arr, int a, int b){
        int t= arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }
    public void sortColors(int[] nums) {
        int l=0, a=0;
        int r=nums.length-1;
        
        while(a<=r){
            if(nums[a]==2){
                swap(nums,a,r);
                r--;
            }
            else if(nums[a]==1){
                a++;
            }
            else if(nums[a]==0){
                swap(nums,l,a);
                a++;
                l++;
            }
        }
    }
}