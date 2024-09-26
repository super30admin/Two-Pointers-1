// Time Complexity : O(n)m=number of elements in  array . 
// Space Complexity : O(1) traverse same array and sort in place.  
// Did this code successfully run on Leetcode :yes. 

// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//just decrementing r when nums[c]==2 , we increment c and l when value is 0, and
 //   increment c when value is 1.
//Success
//Details 
   /**
   * Runtime: 0 ms, faster than 100.00% of Java online submissions for Sort Colors. Memory Usage:
   * 38.1 MB, less than 5.51% of Java online submissions for Sort Colors. Next challenges:
   * just decrementing r when nums[c]==2 , we increment c and l when value is 0, and
   * increment c when value is 1.
   *
   * @param nums
   */
  public void sortColors(int[] nums) {
        if (nums==null|| nums.length==0)
            return;
        int c=0,l=0,r=nums.length-1;
        while (c <= r){
            if (nums[c]==2)
                swap(nums,c,r--);
            else if (nums[c]==0)
                swap(nums,l++,c++);
            else
                c++;
        }
    }

    private void swap(int[] nums,int i, int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }