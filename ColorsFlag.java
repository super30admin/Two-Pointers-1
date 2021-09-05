import java.util.Arrays;

/**
 * ColorsFlag
 */
public class ColorsFlag {

    public void sortColors(int[] nums) {
        int l = 0;
        int m = 0;
        int h = nums.length - 1;
        while (m <= h) {
            if (nums[m] == 0) {
                swap(nums, m, l);
                l++;
                m++;
            } else if (nums[m] == 2) {
                swap(nums, m, h);
                h--;
            } else
                m++;
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        ColorsFlag cf = new ColorsFlag();
        cf.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}