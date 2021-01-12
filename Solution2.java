//Space Complexity:O(1)
//Time Complexity: O(n)
public class Solution2 {
	public int maxArea(int[] height){ 
	if(height == null || height.length == 0)
         return 0;

     int low =0;
     int high = height.length-1;
     int maxArea = 0;
     while(low<high){
         maxArea = Math.max(maxArea,Math.min(height[low],height[high]) * (high-low));
         if(height[low] < height[high])
             low++;
             else
                 high--;
     }
    return maxArea; 
 }
}
