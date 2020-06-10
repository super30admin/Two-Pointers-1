/**
 * Time Complexity : O(n)
 * Space Complexity : O(1)
 */
public class SortColors {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return ;
        int n = nums.length;
        int low,mid,high;
        low = mid = 0; high = n-1;
        while(mid<=high){
            if(nums[mid]==1) mid++;
            else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
            else {
                swap(nums,low,mid);
                low++;
                mid++;
            }
        }
        for(int x: nums){
            System.out.print(x+",");
        }
    }
    
    private void swap(int[] nums,int n1,int n2){
        int temp = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = temp;
  }

  public static void main(String args[]){
      SortColors obj = new SortColors();
      obj.sortColors(new int[]{2,0,2,1,1,0});
  }
}