/* Did this code successfully run on LeetCode :  Yes
Any problem you faced while coding this :  No */
public class ContainerWithMostWater_LC_11 {


    //Approach 1 Brute Force
    //Time complexity - O(n^2)
    //space - O(1)

        public int maxAreaBruteForce(int[] height) {
            int maxArea = 0;

            for(int i =0; i< height.length; i++){
                for(int j = i+1; j<height.length; j++){
                    //take minimum of height[i] and height[j] and multiply it with width which will be (j -i)
                    //and then take max of above calculation and earlier maxArea
                    maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j - i));
                }
            }
            return maxArea;
        }
    // Approach 2 - Two pointers
    //Time complexity - O(n)
    //space - O(1)
    public int maxAreaTwoPointers(int[] height){
        int start = 0;
        int width, maxarea =0;
        int end = height.length-1;
        while(start < end){
            width = end -start; // calculate width so that we can multiply it with min element
            maxarea = Math.max(maxarea, Math.min(height[start], height[end]) * width);

            //shift min pointer
            if(height[start] < height[end]){ //first pointer is lesser than end hence shift start pointer
                start++;
            }else if(height[end] < height[start]){ //end pointer is lesser than start hence shift end pointer
                end--;
            }else{ // both pointer are same hence shift both
                start++;
                end--;
            }
        }
        return maxarea;
    }


}








