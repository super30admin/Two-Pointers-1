
public class SortColors {
	public static void sortColors(int[] nums) {
		int x = 0, y = 0;
		int z = nums.length - 1;
		while (y <= z) {
			if (nums[y] == 2) {
				swap(nums,y, z);
				z--;
			}
			else if(nums[y] == 0) {
				swap(nums, y,x);
				x++;
				y++;
			}
			else
				y++;
		}
	}

	private static void swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 0, 2, 1, 1, 0 };
		sortColors(nums);
	}

}
