public class ContainerWithMostWater {
    public static void main(String args[]){
        //int [] arr = {1,8,6,2,5,4,8,3,7};
        int [] arr ={2,5,3,8,10,6,12,10};
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] height) {
        /*
        //Brute-force approach
        int n = height.length;
        int maxArea = 0;
        for(int i =0; i<n; i++){ //O(n)
            for(int j=i+1; j<n; j++){ //O(n) --> total time complexity O(n^2)
                int currArea = Math.min(height[i], height[j]) * (j-i);
                maxArea = Math.max(maxArea,currArea);
            }
        }
         */

        //two-pointer approach
        int n = height.length;
        int maxArea = 0;
        int left = 0;
        int right = n-1;
        while(left<right){ //O(n)
            int currArea = Math.min(height[left],height[right]) * (right - left);
            maxArea = Math.max(maxArea, currArea);
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

}

//Time complexity : O(n)
//Space complexity : O(1)