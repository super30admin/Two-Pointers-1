//TC: O(n)
//SC: O(1)
//approach: keeping current max area and using 2 pointers to update max area

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int l=0;
        int r=height.length -1;
        int max = 0;
        while(l<r){
            int area = Math.min(height[l],height[r]) * (r-l);
            if(area > max){
                max = area;
            }
            if(height[l] >= height[r]){
                r--;
            }else{l++;}
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
