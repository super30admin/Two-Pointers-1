import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// low = 0s
// mid = 1s
// high = 2s
// TC = O(n) SC = O(1)
public class SortColors {
    public static int[] sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid<=high){
            if(nums[mid] == 2){
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{ // nums[mid] == 0 swap mid and low
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] ans = SortColors.sortColors(new int[]{2,0,2,1,1,0});
        List<Integer> res = new ArrayList<>();
        for(int each:ans){
            res.add(each);
        }
        System.out.println(res);

    }
}
