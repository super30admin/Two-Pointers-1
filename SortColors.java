
// Time complexity: O(n)
// Space Complexity: O(1)
public class SortColors{
    public void sortColors(int[] nums){
        int l = 0;
        int h = nums.length - 1;
        int m = 0;
        while(m <= h){
            switch (nums[m]){
                // If the element at pointer m is 0 then swap with l as all the elements left to m should be 0's
                case 0: {
                    swap(nums, l, m);
                    m++;
                    l++;
                    break;
                }
                // If the element at pointer m is 1 then just increment m so that m remains in the middle between 0's and 2's
                case 1: {
                    m++;
                    break;
                }
                //if the element at pointer m is 2 then swap it with h as all the elements right to m should be 2's
                case 2: {
                    swap(nums, h, m);
                    h--;
                }
            }
        }
    }

    // Helper funtion tp swap two elements
    private void swap(int[] nums, int h, int m) {
        int temp = nums[h];
        nums[h] = nums[m];
        nums[m] = temp;
    }
}