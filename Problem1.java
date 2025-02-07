//Time complexity o(n)
//Space complexity o(1)

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int l = 0; int r = n-1; int mid = 0;
        while(mid<=r){
            if(nums[mid] == 2){
                swap(nums,mid,r);
                r--;
            }else if(nums[mid] == 0){
                swap(nums,mid, l);
                l++;
                mid++;
            }else{
                mid++;
            }
        }
    }

    private void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}