public class ContainMostWater {


        public int maxArea(int[] height) {

            int maxWat = 0;

            int left = 0, right = height.length-1;
            int line1 = 0, line2 = 0;

            while(left < right){ // O(n)

                int contain = (Math.min(height[left], height[right]))*(right - left);

                // updating maximum

                if(contain > maxWat){

                    maxWat = contain;

                    line1 = left;
                    line2 = right;

                }

                // moving two pointers

                if(height[left] < height[right]) {

                    left++;
                }
                else{

                    right--;
                }

            }
            System.out.println("from line " + line1);
            System.out.println("to line " + line2);

            return maxWat;

        }


        /*
        Time Complexity = O(n)
        Space Complexity = O(1)
        */

        public static void main(String[] args){

            ContainMostWater object = new ContainMostWater();

            int[] heights = {1,8,6,2,5,4,8,3,7};

            int result = object.maxArea(heights);

            System.out.println("Maximum water contained is " + result);
        }
}
