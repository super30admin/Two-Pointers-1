// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :



public class Problem1 {
    public static void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        
        while(mid <= high){
            if(nums[mid] == 2){
                swap(nums,mid,high);
                high--;
            }else if(nums[mid] == 0){
                swap(nums,mid,low);
                mid++;
                low++;
            }else{
                mid++;
            }
        }
    }
    
    private static void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] arg) {
        int[] nums = new int[]{1,2,0,0};
        sortColors(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    
}
