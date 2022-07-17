//11. Container With Most Water
//Time Complexity :O(n) As all elements are used to find area. The complexity will be O(n)
//Space Complexity : O(1) i.e. as no extra space is required to store array elements while processing 
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

//Your code here along with comments explaining your approach

/*Step 1: We will 2 pointer method to traverse through array which indicates container with water level. We have to find out the area with maximum water level possible. 
 * Step 2: We will assign 2 pointer named low to array's first element and high to array's last element. Now we will find the area from the difference between low and high 
 * index multiplied by (minimum of 2 pointers i.e. left or right pointer). We will update the max which was initiaLLY made 0. The comparison will go on till low is less than high.
 * Step 3: Comparison stops and returns max area once low crosses high pointer.
 * Step 4: If array[low] is less than high, then increment the low pointer and vice versa. 
 */

//output 49
public class containerWater {

	 public static int maxArea(int[] height) {
	        if(height.length == 0 || height == null) return 0;
	        
	        int low=0;
	        int high=height.length-1;
	        int max=0;
	        
	        while(low < high){
	                
	            max=Math.max(max, Math.min(height[high], height[low]) * (high-low));
	            
	            if(height[low] < height[high])
	            {
	                //max= height[low] * (high-low);  //calc area
	                low++;
	            }
	            else{
	                //max= height[high] * (high-low);  // calc area
	                high--;
	            }
	        }
	        return max;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] h= {1,8,6,2,5,4,8,3,7};
		int result=maxArea(h);
		System.out.println(result);

	}

}
