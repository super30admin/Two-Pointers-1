// Time Complexity : O(N) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/**
 * 1. Mantain 2 pointers. start pointer at 0, end pointer at n-1.
 * 2. if left bar height is less than increment left pointer.
 * 3. if right bar height is less or equal to left decrease heigh pointer.
 * 4. in each iteration find max(h*w,max) as a result. 
 * 5. continue loop then two pointers cross each other. 
 */

public class ContainerWithMostWater {

	public int maxArea(int[] height) {
		int maxarea = 0;
		int leftp = 0;
		int rightp = height.length - 1;
		
		while (leftp < rightp) {
			maxarea = Math.max(maxarea, Math.min(height[leftp], height[rightp]) * (rightp - leftp));
			if (height[leftp] < height[rightp])
				leftp++;
			else
				rightp--;
		}
		return maxarea;
	}

	public static void main(String[] args) {
		int[] height=new int[] {1,8,6,2,5,4,8,3,7};
		System.out.println(new ContainerWithMostWater().maxArea(height));
	}

}
