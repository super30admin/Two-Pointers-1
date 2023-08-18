// Tc = 0(n)
// Sc = 0(1)
public class SortColors {
    public static void main(String[] args) {

        int[] arr = { 2, 0, 2, 1, 1, 0 };
        SortColors obj = new SortColors();
        obj.sortColors(arr);
        System.out.println(obj);

    }

    public void sortColors(int[] nums) {
        int n = nums.length;
        int l = 0;
        int h = n - 1;
        int m = 0;
        while (m <= h) {

            if (nums[m] == 2) {
                swap(nums, h, m);
                h--;
            } else if (nums[m] == 0) {
                swap(nums, l, m);
                l++;
                m++;
            } else {
                m++;
            }
        }

    }

    private void swap(int[] nums, int i, int j) {
        if (i == j)
            return;
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
