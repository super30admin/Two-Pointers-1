// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
/*
 * We have used a two pointer approach where one pointer is at one end and the other pointer is at the other end.
 * We compare the pointer values, if either is less that is the constraining height so we calculate the area
 * and increment that pointer. Same happens with the other pointer - we will decrement the higher pointer.
 */

public class Water {

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};      
        System.out.println(maxArea(height));  
    }

    public static int maxArea(int[] height) {
        int area = 0;
        int pointer1 = 0;
        int pointer2 = height.length - 1;
        
        while(pointer1 < pointer2)
        {
            if(height[pointer1] < height[pointer2])
            {
                area = Math.max(area,(height[pointer1] * (pointer2-pointer1)));
                pointer1 += 1;
            }
            else{
                area = Math.max(area,(height[pointer2] * (pointer2-pointer1)));
                pointer2 -= 1;
            }
        }
        return area;                 
    }    
}
