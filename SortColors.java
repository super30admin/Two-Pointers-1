//TC=O(n)
//SC=O(1)
public class SortColors {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0)
            return;
        int n=nums.length;
        int left=0;
        int mid=0;
        int right=n-1;
        while(mid<=right){
            if(nums[mid]==2){
                swap(nums,mid,right);
                right--;
            }
            else if(nums[mid]==0){
                swap(nums,mid,left);
                left++;
                mid++;
            }
            else{
                mid++;
            }
        }
    }
    private void swap(int[] nums, int low, int high){
        if(low==high)
            return;
        int temp=nums[low];
        nums[low]=nums[high];
        nums[high]=temp;
    }
}
