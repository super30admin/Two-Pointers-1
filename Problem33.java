//Time Complexity: O(n)
//Space Complexity: O(1)
//Did it run on leetcode: yes
//Problems faced any: No

public class Problem33 {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0)
            return;

        int low = 0;
        int high = nums.length-1;
        int curr = 0;

        while(curr<=high){
            //swap curr and low and move both low and curr if curr==0
            if(nums[curr]==0){
                swap(nums, low, curr);
                low++;
                curr++;
            }else if(nums[curr]==2){
                //swap curr and right
                //and decrement right
                swap(nums, curr, high);
                high--;
            }else{
                //means curr = 1
                //move curr pointer
                curr++;
            }
        }
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
