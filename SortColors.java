// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach

/*

Count of all zeros, ones is maintained. numbers in array are changed till the count becomes zero.

*/
public class SortColors{

    public static void sortColors(int[] nums) {
        if(nums== null || nums.length == 0)
        {
            return;
        }

       int one=0,zero=0;

       for(int i:nums)
       {
           if(i==0)
           {
               zero++;
           }
           else if(i==1)
           {
               one++;
           }
       }

       for(int i =0;i<nums.length;i++)
       {
           if(zero>0)
           {
               nums[i]=0;
               zero--;
           }
           else if(one>0)
           {
               nums[i]=1;
               one--;
           }
           else{
               nums[i]=2;
           }
       }

    }

    public static void main(String args[])
    {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);

        for(int i:nums)
        {
            System.out.print(i+" ");
        }
    }
}