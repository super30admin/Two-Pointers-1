/**
 * SortColors : SortColors
 *
 * @author : Kavya Mandaliya
 * @version : 1.0 (Nov 08, 2024)
 * @since : 1.0 (Nov 08, 2024)
 */
public class SortColors {

    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length-1;
        while(mid <= high){
            if(nums[mid] == 1){
                mid++;
            }else if(nums[mid] == 2){
                swap(nums,mid,high);
                high--;
            }else if(nums[mid] == 0){
                swap(nums,mid,low);
                low++;
                mid++;
            }
        }
    }

    public void swap(int[] nums, int i , int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
