// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
class ColorSort {
    public void sortColors(int[] nums) {
        int one = 0;
        int two = 0;
        int zero = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                zero++;
            }
            else if(nums[i]==1){
                one++;
            }
            else{
                two++;
            }
        }
        int k=0;
        while(k<zero){
            nums[k]=0;
        }
        int l=0;
        while(k<one){
            nums[l]=1;
        }
        int m=0;
        while(m<two){
            nums[m]=2;
        }

    }
}