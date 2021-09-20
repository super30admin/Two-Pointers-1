//Time complexity: O(n)
//Space complexity: O(1)
class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while(mid <= high) {
            if(nums[mid] == 0) {
                swap(nums, low, mid);
                mid++;
                low++;
            }
            else if(nums[mid] == 2) {
                swap(nums, high, mid);
                high--;
            }
            else {
                mid++;
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    
    // public static void main(String[] args) {
//         int[] colors = {2, 0, 2, 1, 1, 0};
//         new SortColors().sortColors(colors);
//         System.out.println(new ArrayList<Integer>() {{ for (int i :  colors) add(i); }});
//    
//} 
}