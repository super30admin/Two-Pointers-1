// 

class Solution {
    public void sortColors(int[] nums) {
    if(nums == null || nums.length == 0) return ;
        
    int l=0 , m = 0; int h = nums.length -1;
    
    while(m<=h) {
        if(nums[m] == 0){
            swap(nums,l,m);
            l++;
            m++;
        }
        else if(nums[m] ==2) {
            swap(nums,h,m);
            h--;
        }
        else if(nums[m] ==1){
            m++;
        }
      }

    }
    
    private void swap(int []nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

/*

Complexity Analysis
Time complexity : 
O(N) since it's one pass along the array of length N.

Space complexity : 
O(1) since it's a constant space solution.
*/
