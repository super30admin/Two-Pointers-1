//time complexity: O(n) where n is length of input array
//space complexity: O(1) since sorted in place

import java.util.Arrays;

class SortColors {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0) return;
        int n = nums.length;
        int l=0;
        int mid =0;
        int r=n-1;
        while(mid<=r){
            if(nums[mid]==0){
                swap(nums, mid, l);
                l++;
                mid++;
            } else if(nums[mid]==2){
                swap(nums, mid, r);
                r--;
            } else{
                mid++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public void swap(int[] nums, int i, int j){
        if(i!=j){
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
        }
    }

    public static void main(String[] args) {
        SortColors obj = new SortColors();
        int[] nums = {2,0,2,1,1,0};
        obj.sortColors(nums);
        
    }
}