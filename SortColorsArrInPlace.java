//Time Complexity = O(n) //Traversing entire Array once.
//Space Complexity = O(1) // Because return Datastructure is not considered in Aux Space
// Does it run on LeetCode successfully?: Yes
// Any difficulties: Not as such

//Leetcode: 75 https://leetcode.com/problems/sort-colors/

import java.util.Arrays;


public class SortColorsArrInPlace {

    public void sortColors(int[] nums) {
        if(nums == null || nums.length==1) return;
        int n = nums.length;
        int low=0, mid = 0;
        int high = n-1;
        while(mid<=high){
            if(nums[mid] == 2){
                swap(mid, high, nums);
                high--;
            }else if(nums[mid] == 0){
                swap(mid, low, nums);
                low++;
                mid++;
            }else{
                mid++;
            }
        }
        System.out.println("I am here");
        System.out.println(Arrays.toString(nums)); //Print the final sorted array for result display
    }

    private void swap(int a, int b, int[] nums){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b]= tmp;
    }

    public static void main(String[] args){
        SortColorsArrInPlace obj = new SortColorsArrInPlace();
        int[] nums = new int[] {2,0,2,1,1,0};
        obj.sortColors(nums);
    }



}