package Day13;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SortColors{
    public void sortColors(int[] nums) {

        /*
        //Using sort() works but constraint is not to use
         Arrays.sort(nums);
        */

        /*
        //Two Pass solution: works very well "I like this better"
        //TC: O(n^2) SC: O(1)

         int ones = 0;
        int twos = 0;
        int zeros = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0) zeros++;
            else if(nums[i] == 1) ones++;
            else twos++;
        }

        for(int i=0; i<nums.length; i++){
            if(zeros != 0){
                nums[i] = 0;
                zeros--;
            }
            else if(zeros == 0 && ones != 0){
                nums[i] = 1;
                ones--;
            }
            else{
                nums[i] = 2;
                twos--;
            }
        }

        */


        //Optimal: mid, low, high

        //sorting will solve the problem
        //dont have to go for classics sorting algos
        //we know 0,1,2 only exist; so use three pointers and sort.. DONE!!!

        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid <= high){

            //case1
            if(nums[mid] == 0){
                swap(nums, mid, low);
                mid++;
                low++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums, high, mid);
                high--;
            }
        }

    }

    //swap method to aid third approach

    private void swap(int [] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String args[]){
        SortColors obj = new SortColors();

        int[] nums = new int[]{2,0,2,1,1,0};
        obj.sortColors(nums);

        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }

    }
}