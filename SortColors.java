package TwoPointers1;
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


import java.util.ArrayList;

// Your code here along with comments explaining your approach
class SortColors {
    public void sortColors(int[] nums) {
        int low=0, mid=0, high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==1)
                mid++;
            else if(nums[mid]==0){
                nums[mid] = nums[low];
                nums[low]=0;
                mid++;
                low++;
            } else{
                nums[mid]=nums[high];
                nums[high]=2;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] colors = {2, 0, 2, 1, 1, 0};
        new SortColors().sortColors(colors);
        System.out.println(new ArrayList<Integer>() {{ for (int i :  colors) add(i); }});
    }
}
