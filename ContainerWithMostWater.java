
public class ContainerWithMostWater {
	 public static int maxArea(int[] height) {
		 int i =0, j = height.length-1;
		 int maxArea = Integer.MIN_VALUE;
		 while(i<j) {
			 int minHeight = Math.min(height[i], height[j]);
			 maxArea = Math.max(maxArea, minHeight*(j-i));
			 if(height[i]<= height[j])
				 i++;
			 else
				 j--;
		 }
		return maxArea;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}

}
