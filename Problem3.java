package TwoPointers1;
/**
 * 
 * Here we use a two pointer approach such that based if the height on the left or right is smaller,
 * that corresponding pointer is moved.
 * 
 * Time Complexity :
 * O(n) as we go to every element atleast once
 *  
 * Space Complexity :
 * O(1) as we are not using any auxillary DS
 * 
 * Did this code successfully run on Leetcode : yes
 * 
 * Any problem you faced while coding this : No
 */
public class Problem3 {
    public int maxArea(int[] arr) {
        int max=Integer.MIN_VALUE;

        int low=0;
        int high=arr.length-1;

        while(low<high){
            int width=high-low;
            int height=Math.min(arr[low],arr[high]);

            max=Math.max(max, width*height);

            if(height==arr[low])
                low++;
            else
                high--;
        }

        return max;
    }
}
