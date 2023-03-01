// brute force
public class SortColors {
    public void sortColors(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
// TC - O(n2)
// SC - O(1)

// optimized
public class SortColors {
    public void sortColors(int[] nums) {
        int n = nums.length;
        if(nums==null || n<0) return;
        int low = 0, mid = 0, high = n-1;
        while(mid<=high){
            if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }else if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;
            }else{
                mid++;
            }
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

// TC - O(n)
// SC - O(1)