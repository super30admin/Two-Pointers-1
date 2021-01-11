// time complexity : O(n)
// space complexity : O(1)
package ThirdWeek;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int max = 0;
/*
This is a brute force method with O(n)2
        for(int i=0;i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){
                max = Math.max(max,Math.min(height[i],height[j])*(j-i));
            }
        }

*/
int low =0;
int high = height.length-1;
while(low<high){
    max = Math.max(max,Math.min(height[high],height[low])* high-low );
    if(height[low]<height[high]){
        low++;
    } else {
        high--;
    }
        }
        return max;
    }

    public static void main(String args[]) {
        int arr[] = {4,3,2,1,4};
        //int arr_size = arr.length-1;
       int result = maxArea(arr);
       System.out.println(result);

    }
}
