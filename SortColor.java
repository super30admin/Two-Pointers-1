// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no

public class SortColor {

    public void sortColors(int[] nums) {

        int i = 0, l = 0;
        int r = nums.length - 1;
        while (i <= r){

            if (nums[i] == 0){
                swap(nums, i, l);
                l++;
                i++;
            }
            else if (nums[i] == 2){
                nums = swap(nums, i, r);
                r--;
            }
            else{
                i++;
            }

        }

        System.out.println(nums);
    }

    public int[] swap(int [] nums, int i , int j){

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }

    public static void main(String [] args){
        int[] nums = {2,0,1};
        SortColor obj = new SortColor();
        obj.sortColors(nums);
    }
}
