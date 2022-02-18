// time complexity - O(N)
//Space complexity - O(N), extra space -O(1)
// Code run successfully in leetcode.
// I have initially written the below code, but starting edge case is failing
//unable to understand why?
/* while (a<=r){
                        
    if(nums[a]==2){
        if(nums[r]!=2){
            swap(nums, a, r);
            r--;
            if(nums[a]==0){
                swap(nums, l,a);
                    l++;
                    a++;
                } else {
                
                a++;
            }
            
}else r--;
}else a++;
*/
class Solution {
    public void sortColors(int[] nums) {
        int a , l, r;
        l = 0;
        a = 0;
        r= nums.length-1;
        
        while (a<=r){
            if (nums[a]==2){
                swap(nums,a,r);
                r--;
            }else if (nums[a]==1){
                a++;
            }else{
                swap(nums,a,l);
                l++;
                a++;
            }
        }
            
        }

        
     private void swap(int[] arr,int a ,int b){
           int temp = arr[a];
            
           arr[a] = arr[b];
           arr[b]= temp;
       }
        
    }
