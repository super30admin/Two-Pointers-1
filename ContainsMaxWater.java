package s30Coding;

//Time Complexity :- O(n)
//Space Complexity :- O(1)
//LeetCode :- Yes

public class ContainsMaxWater {
	public int maxArea(int[] height) {
	       int maxarea = 0,  i = 0, j = height.length-1;
	        while(i < j){
	            maxarea = Math.max(maxarea, Math.min(height[i],height[j])*(j-i));
	            if(height[i] < height[j]){
	                i++;
	            }
	            else{
	                j--;
	            }
	        }
	        return maxarea;
	    }
}
