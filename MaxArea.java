//Approach: here to calculate maximum area we will need larger length. To achieve larger length, we will look for array element which is far away from starting index. 
//so first start with maximum length by taking first and last element. keep two pointers at start and end. and 	//calculate area length= difference between indexes and height is  min element between those index 
//and ,compare it with MaxArea.
//if height of start index less than end index  then increase start index.If height of end index is less than start index then increase endIndex
//when both index crossess return maxArea.

//Time complexity of this function: O(n)  n is length of array
//Space Complexity of this function: O(1)  

//Did this code successfully run on Leetcode : yes
//Any problem you faced while coding this:yes

public class MaxArea {
	
	public static int getMaxArea(int[] input) {
		int maxArea =0;
		int left =0;
		int right = input.length-1;
		
		//iterate through array 
		while(left<right) {
			//calculate area length= difference between indexes and height is  min element between those index
			int area = (right-left)* Math.min(input[left],input[right]);
			//comapre it with maxarea
			if(area>maxArea) {
				maxArea=area;
			}
			//if height is less at left then increase left otherwise increase right
			if(input[left]<input[right]) left++;
			else right--;
		}
		return maxArea;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,8,6,2,5,4,8,3,7};
		int area =getMaxArea(input);
		System.out.println("maximum area is ="+area);

	}

}
