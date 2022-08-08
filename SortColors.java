// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

/*
current pointer is mid here, if it points to 0 we swap it with low pointer, increment the low and current
if the current pointer is 2 then we swap it with the last element, increment the current pointer and decrement the high pointer,
otherwise, just like a normal iteration we increment mid.
*/



public class SortColors{
    public static void sortColors(int[] nums) {
        //dutch national flag algorithm
        int low=0,high=nums.length-1, mid=0;
            while(mid<=high)
            {  //1,0,2 
                switch(nums[mid])
                {
                    case 0: 
                        swap(nums,low,mid);
                        low++;
                        mid++;
                        break;
                    case 1:
                        mid++;
                        break;
                    case 2:
                        swap(nums,mid,high);
                        high--;
                        break;
                }

            }
        }
    public static void swap(int[] arr,int i,int j)
    {
        int swap=arr[i];
        arr[i]=arr[j];
        arr[j]=swap;
    }
    public static void main(String[] args)
   {
      int[] nums={2,0,2,1,1,0};
       sortColors(nums);
      for(int i=0;i<nums.length;i++)
      {
          System.out.println(nums[i]);
      }
   }
}