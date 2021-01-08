
public class ContainerMaxWater {
	 public int maxArea(int[] height) {
	        int max=Integer.MIN_VALUE;
	        for(int i=0;i<height.length;i++)
	        {
	            for(int j=i+1;j<height.length;j++)
	            {
	            
	                max=Math.max(max,(j-i)*Math.min(height[i],height[j]));
	            }
	        }
	        System.out.print("max"+max);
	        return max;
	    }
}
