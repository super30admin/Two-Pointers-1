package com.javadwarf.leetcode.twopointer;

public class _11_ContainerWithMostWater {

	public static void main(String[] args) {
		System.out.println(maxArea1(new int[] {1,8,6,2,5,4,8,3,7}));
	}

	//Brute Force : O(n^2)
	// find area b/w all possible two line pairs
	public  static int maxArea(int[] height) {

		if(height == null || height.length <2) return 0;

		int result = 0;

		for(int i =0; i<height.length; i++) {

			for(int j=i+1; j<height.length;j++) {
				int temp = Integer.min(height[i], height[j]) * (j-i);
				result = Integer.max(temp,result);
			}
		}
		return result;
	}

	// Two pointer approach : O(n)
	// left at 0 and right at arr.length-1
	//  the minimum(arr[left], arr[right])*(right-left) will used to calculate result 
	public  static int maxArea1(int[] height) {

		if(height == null || height.length <2) return 0;

		int result = 0;
		int left  = 0 ;
		int right = height.length-1;

		while(left < right) {

			if(height[left] < height[right]) {
				int temp = height[left]*(right-left);
				result = Integer.max(temp,result);
				left++;
			}
			else {
				int temp =  height[right]*(right-left);
				result = Integer.max(temp,result);
				right--;	
			}
		}
		return result;
	}

	//same logic as above , consice code
	public int maxArea2(int[] height) {

		if(height == null || height.length <2) return 0;

		int left = 0 ;
		int right = height.length-1;
		int area = Integer.MIN_VALUE;

		while(left < right){
			area = Math.max(area, Math.min(height[left], height[right])*(right-left));
			if(height[left]< height[right]) left++;
			else right--;
		}

		return area;
	}

}
