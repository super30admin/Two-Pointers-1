//Time Complexity: O(n)
//Space Complexity: O(1)

public class ContainerWithMostWaterArea {
    public static int maxArea(int[] height) {
        int area = 0;
        int temp = 0;
        int start = 0;
        int width = 0;
        int end = height.length - 1;
        for(int i=0;i<height.length;i++){
            // if(start < height.length && end >=0){

            //getting the difference
            width = Math.abs(start - end);
            // System.out.println("start:"+start+" end:"+end);

            //check if the first container is lesser than the second one than compute area considering the first one and increment it else compute area using the last container and decrement the last pointer
            if(height[start]<height[end] ){
                // System.out.println(height[start]);
                temp = width * height[start];
                start+=1;
            }
            else{
                // System.out.println(height[end]);
                temp = width * height[end];
                end-=1;
            }
            // System.out.println(i+"-->"+temp+" width:"+width);
            //keeping track of max area
            if(area < temp)
                area = temp;
        }
        return area;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,8,1};
        System.out.println(maxArea(nums));
    }
}