//TC: O(n)
//SC: O(1)
public class SortCol {
  public void sortColors(int[] nums) {
    int f=0;
    int m =0;
    int l= nums.length-1;

    while(l>=m){
      if(nums[m]==2){
        swapNums(nums, l,m);
        l--;
      }
      else if (nums[m]==1){
        m++;
      }
      else{
        swapNums(nums, m,f);
        f++;
        m++;
      }
    }
  }

  private void swapNums(int[] nums, int i, int j){
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}
