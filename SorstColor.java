// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES

//here, we are maintaing 3 pointers (low, mid, high) and it will keep track of (0, 1, 2) accordingly.

class SortColor {
    public void sortColors(int[] nums) {

        if(nums == null || nums.length == 0)return;

        int n = nums.length;
        int low = 0, mid=0, high=n-1;

        //when mid crosses high, it'll terminate the loop and array will be sorted.
        while(mid<=high){
            if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            } else if(nums[mid]==0){
                swap(nums,mid,low);
                mid++;
                low++;
            } else {
                mid++;
            }
        }

        return;
    }

    void swap(int arr[],int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}