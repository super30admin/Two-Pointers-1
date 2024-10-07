// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach



//with using inbuilt sort TC - O(nlogn)
// with 2 pass for loop first collect count of 0,1,2 then second pass store in array in order.
// we will do with three pointers l,m,h starting l,m from begining till end h 
//and swaping values carried by m with l and h
//TC - O(n) SC- O(1)

import java.util.Arrays;
class SortColors {
    public void sortColors(int[] nums) {

        int n = nums.length;

        int l =0, m =0, h = n-1;

        while(m<=h){
            if(nums[m] == 2){
                swap(nums, m, h);
                h--;
            }else if(nums[m] == 0){
                swap(nums, m, l);
                l++; m++;
            }else{
                m++;
            }
        }


            System.out.println(Arrays.toString(nums));

        
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        SortColors p = new SortColors();
        int[] arr = new int[]{2,0,2,1,1,0};
        p.sortColors(arr);
    }
}