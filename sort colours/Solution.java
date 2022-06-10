// Time complexity = O(n)
//Space complexity= O(1)
class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length<2) return;
        if(nums.length==2){
            if(nums[0]>nums[1]) nums=swap(nums,0,1);
            return;
        }
        int a=0;
        int c= nums.length-1;
        int b=0;
        // if(nums[0]>0) nums=swap(nums,0,c);
      while(b<=c){
            if(nums[b]==0){
                nums=swap(nums,a,b);
                a++;
                b++;
            } else if(nums[b]==2){
                nums=swap(nums,b,c);
                c--;
                 // b--;
            } else {
                b++;
            }
                
            }
        // if(nums[0]!=0) nums=swap(nums,0,1);
        }
    
     public int[] swap(int[] nums, int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        return nums;
    }
    }
