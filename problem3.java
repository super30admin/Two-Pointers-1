public class problem3 {

    public static void maxArea(int[] height) {
        int vol = 0;
		for(int i=0;i<height.length;i++) {
			for(int j=i;j<height.length;j++) {
if(height[i]<=height[j] && ((j-i)*height[i])>vol) vol = (j-i)*height[i];
if((height[j]<=height[i]) && ((j-i)*height[j])>vol) vol = (j-i)*height[j];
			}
		}
        System.out.println(vol);
    }

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        maxArea(arr);
    }
}