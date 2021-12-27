// Time Complexity : O (N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class SortColors {
    public void sortColors(int[] arr) {

        // Keep 3 pointers low, i ,high. i acts as mid
        // Keep low to track 0's, high for 2's and i for 1's
        int low=0,high=arr.length-1;
   int i=0;

   while(i<=high)
   {
    if(arr[i]==0)
      { swap(arr,i,low);
        i++;
        low++;
      }
     else if(arr[i]==1)
        i++;
      else 
      {
        swap(arr,i,high);
        high--;
      }

   }
  
   
  }
  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}


