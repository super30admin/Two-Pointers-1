// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Y
// Any problem you faced while coding this : N

import java.util.Arrays;


public class SortColors {
    public void sortColors(int[] nums) {


        int n = nums.length;
        int l =0;
        int m =0;
        int h= n-1;
        while(m<=h)
        {
            if(nums[m] == 0)
            {
                swap(nums,m,l);
                l++;
                m++;
            }
            else if(nums[m] == 2)
            {
                swap(nums, m, h);
                h--;
            }
            else
            {
                m++;
            }
        }
      
    }

      public void swap(int [] nums, int i, int j)
        {
            int temp = 0;
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

public static void main(String[] args)
{
    int[] array = {2,0,2,1,1,0}; 
    SortColors t = new SortColors();
    t.sortColors(array);
    System.out.println(Arrays.toString(array));
    
}
}
