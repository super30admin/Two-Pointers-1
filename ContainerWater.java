// TC: O(N) since we are traversing the array only once and N represents number of elements in array
// SC: O(1) since we are not using any extra space

// We are checking from start and end of the give array, we will take minimum of height because we cannot store water if one height is larger and one height
// is smaller. To calculate storage capacity, we need consider width and height, height we are checking start and end until we have the maximum  
// of water height level. To calculate width, we will take the difference of the latest water height considered, Once we multiple height and width, we get
// total amount to store water, We keep checking for every combination until we get maximum value.

public class ContainerWater {
	
	public int MostWaterContainer(int[] height) {
		
		int i = 0, j = height.length-1;
		int width = 0, max = Integer.MIN_VALUE, minHeight = Integer.MAX_VALUE;
		
		while(i<j) {
			
			if(height[i]<height[j]) {
				minHeight = height[i];
				width = j - i;
				i++;
			}else {
				minHeight = height[j];
				width = j- i;
				j--;
			}
			max = Math.max(max,  minHeight*width);
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		ContainerWater cw = new ContainerWater();
		int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
		System.out.println(cw.MostWaterContainer(height));
	}

}
