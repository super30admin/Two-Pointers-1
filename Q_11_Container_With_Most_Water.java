package Q_11_Container_With_Most_Water;

//Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
//
//Note: You may not slant the container and n is at least 2.
//
// 
//
//
//
//The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
//
// 
//
//Example:
//
//Input: [1,8,6,2,5,4,8,3,7]
//Output: 49

//Time Complexity  : O(n)  
//Space Complexity : O(1) 


public class Solution {

	public int maxArea(int[] height) {
		int max =0;
		int left = 0;
		int right = height.length-1;
		
		while(left < right) {
			max = Math.max(max, Math.min(height[left],height[right])* (right - left));
			
			if(height[left]< height[right]) {
				left++;
			}else {
				right--;
			}
		}
		return max;    
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] height = {1,8,6,2,5,4,8,3,7};
		Solution s = new Solution();
		System.out.println(s.maxArea(height));
	}

}
