//Time Complexity: O(n)
//Space Complexity: O(1)


import java.util.Arrays;

public class SortColor {

    public static void main(String[] args) {
        int[] nums = new int[]{2,0,2,1,1,0};
        //null case
        if(nums == null || nums.length ==0){
            return;
        }
        int[] result = sortColor(nums);
        System.out.println("Sorted Color Array: "+ Arrays.toString(result));
//        for(int i=0;i<result.length;i++){
//            System.out.println("Sorted color: "+result[i]);
//        }

    }
    private static int[] sortColor(int[] nums){

        int low=0;
        int high=nums.length-1;
        int mid=0;

        while(mid<=high){

            if(nums[mid] == 0){
                swap(nums,mid,low);
                low++;
                mid++;
            }else if(nums[mid] == 2){
                swap(nums,mid,high);
                high--;
            }else{
                mid++;
            }
        }
        return nums;
    }

    private static void swap(int[] nums, int i, int j){

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
