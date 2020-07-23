/*****************************Brute Force*******************************/
// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/* consider the area for every possible pair of the lines and 
 * return the maximum area out of those.*/

public class Container_With_Most_Water {
	public static int maxArea(int[] height) {
        int maxArea = 0;
        for(int i =0; i<height.length; i++){
            for(int j=i+1; j<height.length; j++){
                maxArea = Math.max(maxArea, (j-i) * Math.min(height[i], height[j]) );
            }
        }
        return maxArea;
    }
	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}
}

/*****************************Two Pointer Approach*******************************/
//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

/* Using two pointers, low (pointing to first element) and high (pointing to last element). maxarea to store the maximum area obtained.
 * The area between two lines is the max of product of the minimum of the two heights and the distance between them.
 * if the height of low pointer is less than high pointer, we increment low pointer, else increment high*/

public class Container_With_Most_Water {
	public static int maxArea(int[] height) {
         int maxArea = 0;
         int low = 0, high = height.length-1;
         while(low < high){
             maxArea = Math.max(maxArea, (high - low) * Math.min(height[low], height[high]));
             if(height[low] < height[high])
                 low++;
             else
                 high--;
         }
         return maxArea;
 }
	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}
}

