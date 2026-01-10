import java.util.Arrays;
public class SortColors {
    public void sortColors(int[] nums) {
        int n =  nums.length;
        int left = 0;
        int right = n-1;
        int mid = 0;
        while(mid <= right){ //O(n)
            if(nums[mid] == 2){
                swap(nums, mid, right);
                right --;
            } else if(nums[mid] == 0){
                swap(nums, mid, left);
                left++;
                mid++;
            } else {
                mid++;
            }
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    public static void main(String[] args) {
        int[] arr2 = {0,0,2,1,1,0,0,1,2,2};

        SortColors sc = new SortColors();
        sc.sortColors(arr2);

        System.out.println(Arrays.toString(arr2));
    }
}

//Time complexity : O(n)
//Space complexity : O(1)