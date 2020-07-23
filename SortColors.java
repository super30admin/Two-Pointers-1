//Optimal Solution
//The time would be O(n) and space complexity is O(1)
class Solution {
  public void sortColors(int[] nums) {
    if(nums.length == 0)
      return;
    int low =0,mid=0,high=nums.length-1;
    for(int i=0;i<nums.length;i++){
      if(nums[mid] == 1)
        mid++;
      else if(nums[mid] == 2){
        swap(mid,high,nums);
        high--;
      }
      else if(nums[mid] == 0){
        swap(low,mid,nums);
        low++;
        mid++;
      }
    }
  }
  public void swap(int a,int b, int[] nums){
    int temp = nums[a];
    nums[a] = nums[b];
    nums[b] = temp;
  }
}

//Bruteforce Solution
//The time would be O(n*n) though it is a separate for loops it will account to n square as all the elements are being looped again
// space complexity is O(1)
class Solution {
  public void sortColors(int[] nums) {
    if(nums.length == 0)
      return;
    int count1 =0;int count2 = 0; int count3 = 0;
    for(int i=0;i<nums.length;i++){
      if(nums[i] == 0)
        count1++;
      if(nums[i] == 1)
        count2++;
      if(nums[i] == 2)
        count3++;
    }
    for(int i =0;i<count1;i++)
      nums[i] = 0;
    for(int i =count1;i<(count1+count2);i++)
      nums[i] = 1;
    for(int i =count1+count2;i<nums.length;i++)
      nums[i] = 2;
  }
}