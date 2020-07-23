//Time Complexity : O(n)
//Space Complexity : O(1)
/*Approach
-taking two pointers and looking at minimum of the two and calculating the area
low which is from start of array and high which is last number of array
-moving the minimum out of the two since we want to get max area
-updating area whenever we get `more than that
 */
public class ContainerWater{
    public static int maxArea(int[] height) {
        int area= 0;
        int low = 0;
        int high = height.length -1;
        int min;
        while(low<high){
            min = Math.min(height[low],height[high]);
            area = Math.max(area,(high-low)*min);
            if(height[low]<height[high]) low++;
            else high--;
        }
        return area;

    }

    public static void main(String args[]){
        System.out.println(maxArea(new int[]{1,6,2,5,4,3}));
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(maxArea(new int[]{}));

    }
}