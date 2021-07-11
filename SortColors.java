public class SortColors {
    private enum Colors {
        RED,
        WHITE,
        BLUE
    }
    
    //Three pointer Approach
    //Low and mid pointer at the first position
    //High pointer at the last position
    //If mid is 0 swap with low
    //else If mid is 2 swap with high
    //else move the mid.
    //TC: O(N) Iterating the all numbers only once
    //SC: O(1) Replacing the array itself.
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int mid = 0;
        
        while(mid<=high) {
            int middle = nums[mid];
            if(middle == Colors.RED.ordinal()) {
                swap(nums, mid ,low);
                    low++;
                    mid++;
            } else if(middle == Colors.WHITE.ordinal()) {
                    mid++;
            } else if(middle == Colors.BLUE.ordinal()) {
                    swap(nums, mid, high);
                    high--;
            }
        }
    }
    
    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void main(String[] args) {
        SortColors sortColorsObj = new SortColors();
        sortColorsObj.sortColors(new int[]{2,0,1});

    }
}