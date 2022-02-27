//Time Complextity : O(n)  length of height
//Space Complexity : O(1)
//didn't face any problems
//runs successfully

public class ContainerWithMostWater11LeetCode {


    public int maxArea(int[] height) {

        int left =0;                                            //left pointer
        int right = height.length-1;                            //right pointer
        int maxArea = 0;                                        //max area

        while(left<=right){

            int b = right - left;                               //breath
            int h = Math.min(height[left], height[right]);      //height
            maxArea = Math.max(maxArea, b*h);                   //calculate new area and check with maxArea

            if(height[left]<=height[right]){                    //check if left height is lesser than the right height
                left++;                                         //if so, then increase the left pointer
            }
            else{                                               //if not then decreament than the right pointer
                right--;
            }

        }
        return maxArea;

    }

}

