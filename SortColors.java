// Time Complexity : O(n)
// Space Complexity : O(1)

class SortColors {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;
            int n= nums.length;
           int low=0;
           int high = n-1;
           int mid = 0;
           while(mid<=high){
               if(nums[mid] == 0){
                   swap(nums,mid,low);
                   mid++;
                   low++;
               }else if(nums[mid] ==2){
                   swap(nums,mid,high);
                   high--;
               }else{
                   mid++;
               }
           }
    }
    private void swap(int[] nums, int x, int y){
            if(x==y)return;
            int temp = nums[y];
            nums[y]=nums[x];
            nums[x] = temp;
        }
}