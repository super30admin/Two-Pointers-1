public class MaxWaterContainer {
        public int maxArea(int[] height) {
        /*
        Approach 1:
        Brute Force - Make all possible pairs of heights , then calculate the are and keep track of the maximum area.
        TC: O(n^2) where n is the size of height
        SC: O(1)

        This solution gives TLE.



        if(height == null || height.length==0) return 0;

        int maxArea=0;
        int n=height.length;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                maxArea=Math.max(Math.min(height[i],height[j]) * (j-i),maxArea);
            }
        }
        return maxArea;

        */

        /*

        Approach 2:

        Two pointers - start from left and right ends of the array -> we will have maximum width ,
        at any point we will have choice of moving either low of high , we will move the one which is smaller as we
        are aiming for a maxHeight , so when we move inside our width starts decreasing so we should aim for maximum height
        to maximize our maxArea

        TC: O(n) where n is the size of height
        SC: O(1)

        */
            if(height == null || height.length==0) return 0;

            int maxArea=0;
            int n=height.length;
            int low=0,high=n-1;

            while(low<high){
                maxArea=Math.max(maxArea,(Math.min(height[low],height[high])*(high-low)));
                if(height[low]<height[high]){
                    low++;
                }
                else{
                    high--;
                }
            }
            return maxArea;
        }
}
