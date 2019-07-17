/**
 * Idea : 
 * 1. Brute force - compare each pair of elements and find if it forms the max volume
 * 
 * Time Complexity: O(n^2)
 * Space Cmplexity: O(1) no extra space used
 * Leetcode: Yes
 */


class ContainerWithMostWater {

    public int maxArea(int[] height) {
        
		int maxArea = 0;
		for(int i=0;i<height.length;i++) {
			for(int j=i+1;j<height.length;j++) {
				int area = (j-i) * (height[j] > height[i] ? height[i] : height[j]);
				if(area > maxArea) {
					maxArea = area;
				}
				
				
				
			}
			
		}
		
		return maxArea;
    }
    public static void main(String[] args){
        System.out.println("Container with most water");
        ContainerWithMostWater obj = new ContainerWithMostWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(obj.maxArea(height));

    }
}