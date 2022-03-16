// Time Complexity : O(n)
// Space Complexity : O(1)
public class ContainerWithMostWater {
	public int maxArea(int[] height) {
		//null case
		if(height==null || height.length==0) return 0;
		
		//find max area: area= height*width
		int result=0;
		int low=0;
		int high=height.length-1;
		
		while(low<high) {
			result= Math.max(result, Math.min(height[low], height[high])*(high-low));
			//move pointers
			if(height[low] <= height[high]) {
				low++;
			}else {
				high--;
			}
		}
		
		return result;
	}
	
	//Driver Code
	public static void main (String[] args) {
		ContainerWithMostWater ob= new ContainerWithMostWater();
		int[] nums= {1,8,6,2,5,4,8,3,7};	
		System.out.println("Maximum amount of water a container can store:"+ ob.maxArea(nums));		
	}
}
