class SortColors {
    //time:O(n)
    //space:O(1)
    //did it run successfully on leetcode: yes
    public void sortColors(int[] nums) {
        
        //initializing mid,low and high
        int low = 0;

        int mid = 0;

        int high = nums.length - 1;
        
        //until mid reaches high
        while (mid <= high){
            //if element at mid is 1
            if (nums[mid] == 1)
                //increase mid
                mid++;
             //if element at mid is 0
            else if (nums[mid] == 0)
                //icrease mid and low and swap element at mid and low
                swap(nums, low++, mid++);

            else
                //if element at mid is something else
                //decrease high and swap element at mid and high
                swap(nums, mid, high--);
        }

    }
    //method to swap

    private void swap(int[] nums, int i, int j) {

        int temp = nums[i];

        nums[i] = nums[j];

        nums[j] = temp;

    }
}