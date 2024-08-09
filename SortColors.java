//Time Complexity: O(n)
//Spac Complexity: O(1)
import java.util.Arrays;

public class SortColors {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==2){
                swap(nums,mid, high);
                high--;
            }
            else if(nums[mid]==0){
                swap(nums, mid, low);
                mid++;
                low++;
            }
            else{
                mid = mid+1;
            }
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
