// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes

public class SortColors {
    public void sortColors(int[] nums) {
        int n= nums.length;
        int low=0;
        int mid =0;
        int high=n-1;

        while(mid<=high){
            if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }else if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }else{
                mid++;
            }
        }
    }


    private void swap(int[] nums, int i, int j){
        int temp= nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
