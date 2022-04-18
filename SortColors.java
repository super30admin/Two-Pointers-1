class SortColors {

    // Time Complexity : 0(n)
// Space Complexity :0(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach: I took three pointer low high and mid depicting the occurence
    //of red, blue and white. Setting low and mid to 0 and high to nums.length-1, I check if my mid pointer is pointing to 2
    //or not, if yes, then I am swapping the value of mid and high to keep all of my blue colors at last. Also decrementing my
    //high pointer. Then I am checking if mid is equal to 0 or not. If yes, the swapping the mid with low and keeping my 0's
    //at the beginning. If it's neither then I am inreasing my mid pointer as I want to keep all my 1's in between.

    public void sortColors(int[] nums) {
        int high = nums.length-1;
        int low = 0;
        int mid = 0;
        while(mid <= high){
            if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }
            else if(nums[mid] ==0){
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else{
                mid++;
            }
        }
    }
    public void swap(int [] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}