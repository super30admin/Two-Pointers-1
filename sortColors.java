    /*  Explanation
    # Leetcode problem link : https://leetcode.com/problems/sort-colors/
    Time Complexity for operators : o(n) .. number of  elements in the array
    Extra Space Complexity for operators : o(1) 
    Did this code successfully run on Leetcode : Yes
    Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
        # Basic approach : Three pointers and calcualte number of colors.

        # Optimized approach same like basic approach: 
                              
            # 1. traverse thru thee array and left and current pointing to 0 and right pointing to last element.
              2. if the element is zero then  swap current  and left and increase both the pointers.
              3. If it is one then increse current only.
              3. else swap current and right and decrese right. this will be if number is 2.
       */

    import java.util.*;
    public class sortColors{

        public static void main(String args[]) {
                    int nums[] = new int[]{2,0,2,1,1,0};
                    sortColorsProblem(nums);
                    for(int i=0;i<nums.length;i++)
                        System.out.print(nums[i]+" ");
                    System.out.println();
        }
                
                            
        public static void sortColorsProblem(int nums[]) {
            if(nums ==null || nums.length==0)
                return;

            // three points solution

            // int zero = 0,one=0,two=0;
            // for(int i=0;i<nums.length;i++){
            //     if(nums[i]==0) zero++;
            //     if(nums[i]==1) one++;
            //     if(nums[i]==2) two++;
            // }
            
            // for(int i=0;i<zero;i++){
            //     nums[i] = 0;
            // }
            
            // for(int i=zero;i<zero+one;i++){
            //     nums[i] = 1;
            // }
            
            // for(int i=zero+one;i<zero+one+two;i++){
            //     nums[i] = 2;
            // } 

            int left = 0;
            int curr = 0;
            int right = nums.length-1;
            
            while(curr <= right){
                if(nums[curr] == 0){
                    swapping(nums,curr,left);
                    left += 1;
                    curr += 1;
                }else if(nums[curr] == 1){
                    curr += 1;
                }else{
                    swapping(nums,curr,right);
                    right -= 1;
                }
            }


        }

        public static void swapping(int[] nums,int i,int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }