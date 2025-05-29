// TC: O(n)
// SC: O(1)
// Approach: Consider 3 variables low, mid and high. Compare and use the swap function.

public class SortColors {
  public void sortColors(int[] nums) {
    int n = nums.length;
    int low = 0;
    int mid = 0;
    int high = n - 1;

    while (mid <= high) {
      if (nums[mid] == 1) {
        mid++;
      } else if (nums[mid] == 2) {
        swap(nums, mid, high);
        high--;
      } else {
        swap(nums, low, mid);
        low++;
        mid++;
      }
    }
  }

  private void swap(int[] nums, int mid, int lorh) {
    int temp = nums[lorh];
    nums[lorh] = nums[mid];
    nums[mid] = temp;
  }

  public static void main(String[] args) {
    SortColors sc = new SortColors();
    int[] nums = new int[] { 2, 0, 2, 1, 1, 0 };

    sc.sortColors(nums);
  }
}
