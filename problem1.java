import java.util.Arrays;

class sortColor{
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;

        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        while(mid <= high){
            if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }
            else if(nums[mid] == 0){
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else{
                mid++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
        private void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    
    
    public static void main(String[] args) {
        sortColor sc = new sortColor();
        int[] nums = {2,0,2,1,1,0};
        sc.sortColors(nums);
    }
}