//TC On
//SC O1
public class mostWater {
    public static void main(String[] args) {
       int[] height = {1,8,6,2,5,4,8,3,7};
       maxArea(height);
    }
    public static int maxArea(int[] height) {
        int l=0;
        int h=height.length-1;
        int max=0;
        while(l<h){
            int curMax=(h-l)*Math.min(height[l],height[h]);
            max=Math.max(curMax,max);
            if(height[l]<height[h]){
                l++;
            }
            else{
                h--;
            }
        }
        System.out.println(max);
        return max;
    }
}
