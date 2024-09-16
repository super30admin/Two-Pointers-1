package Day13;

public class AreaWater  {
    public int maxArea(int[] height) {

        /*
        //Brute Force: Works well with TLE
        //TC: O(n^2) SC: O(1)
        if(height == null || height.length == 0) return 0;

        int max = 0;

        for(int i=0; i<height.length-1; i++){
            for(int j=i+1; j<height.length; j++){
                max = Math.max(max, Math.min(height[i], height[j] )* (j-1));
            }
        }

        return max;

        */

        //Optimal Solition using Two Pointers
        //TC: O(n) SC: O(1)

        if(height == null || height.length == 0) return 0;

        int max = 0;
        int low = 0;
        int high = height.length - 1;

        while(low < high){
            max = Math.max(max, Math.min(height[low], height[high]) * (high-low));

            if(height[low] < height[high]){
                low++;
            }
            else{
                high--;
            }

            //Both are equal you will still decrease high
        }
        return max;

    }

    public static void main(String args[]){
        AreaWater obj = new AreaWater();

        int height[] = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println("The maximum area of water within the container: "+ obj.maxArea(height));
    }
}