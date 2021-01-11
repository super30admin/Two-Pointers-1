// time complexity : O(n)
// space complexity : O(1)
package ThirdWeek;

import java.util.Arrays;

public class SortColors {

    public static void sortColors(int[] nums) {

        if(nums==null || nums.length ==0)return;

        int low=0;int mid=0;int high = nums.length-1;

        while(mid<=high){
            if(nums[mid] == 1){
                mid++;
            } else if(nums[mid] == 0){
                swap(nums,low,mid);
                low++;mid++;
            } else{
                swap(nums,mid,high);
                high--;
            }

        }
        System.out.println(Arrays.toString(nums));
    }

    public static int[] swap(int[] nums,int low,int high){

        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
        return nums;
    }

    public static void main(String args[]) {
        int arr[] = {2,0,2,1,1,0};
        //int arr_size = arr.length-1;
        sortColors(arr);


    }

}
