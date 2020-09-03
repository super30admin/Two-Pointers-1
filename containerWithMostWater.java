    /*  Explanation
    # Leetcode problem link : https://leetcode.com/problems/container-with-most-water/
    Time Complexity for operators : o(n) .. number of  elements in the array
    Extra Space Complexity for operators : o(1) 
    Did this code successfully run on Leetcode : Yes
    Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
        # Basic approach : Two for loops.

        # Optimized approach same like basic approach: 
                              
            # 1. traverse thru thee array and low pointing to 0 and high pointing to last element.
              2. move high and low pointer according to its value. If low if less then move it to right.
                 if high is less then move high to left.
              3. return max of max and product we calcualte.
       */

    import java.util.*;
    public class containerWithMostWater{

        public static void main(String args[]) {
                    int height[] = new int[]{1,8,6,2,5,4,8,3,7};
                    int list = maxArea(height);
                    System.out.println(list);
        }
                
                            
        public static int maxArea(int height[]) {
            if(height == null || height.length ==0)
               return 0;
                
            int low = 0;
            int high = height.length-1;
            int max = 0;
            while(low<high){
                int product = 1;
                if(height[low]<height[high]){
                    product = height[low] * (high-low);
                    low += 1;
                }else{
                    product = height[high] * (high-low);
                    high -= 1;
                }        
                max = Math.max(max,product);
            }      
            return max;
        }
    }